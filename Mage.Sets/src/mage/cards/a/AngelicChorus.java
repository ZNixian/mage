/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.a;

import java.util.UUID;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.players.Player;

/**
 *
 * @author Backfir3
 */
public class AngelicChorus extends CardImpl {

    public AngelicChorus(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{3}{W}{W}");

        // Whenever a creature enters the battlefield under your control, you gain life equal to its toughness.
        this.addAbility(new AngelicChorusTriggeredAbility());
    }

    public AngelicChorus(final AngelicChorus card) {
        super(card);
    }

    @Override
    public AngelicChorus copy() {
        return new AngelicChorus(this);
    }
}

class AngelicChorusTriggeredAbility extends TriggeredAbilityImpl {

    public AngelicChorusTriggeredAbility() {
        super(Zone.BATTLEFIELD, new AngelicChorusEffect(), false);
    }

    public AngelicChorusTriggeredAbility(AngelicChorusTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == EventType.ENTERS_THE_BATTLEFIELD;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        Permanent permanent = game.getPermanent(event.getTargetId());
        if (permanent.getCardType().contains(CardType.CREATURE)
                && permanent.getControllerId().equals(this.controllerId)) {
            this.getEffects().get(0).setValue("lifeSource", event.getTargetId());
            return true;
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever a creature enters the battlefield under your control, you gain life equal to its toughness.";
    }

    @Override
    public AngelicChorusTriggeredAbility copy() {
        return new AngelicChorusTriggeredAbility(this);
    }
}

class AngelicChorusEffect extends OneShotEffect {

    public AngelicChorusEffect() {
        super(Outcome.GainLife);
        staticText = "you gain life equal to its toughness";
    }

    public AngelicChorusEffect(final AngelicChorusEffect effect) {
        super(effect);
    }

    @Override
    public AngelicChorusEffect copy() {
        return new AngelicChorusEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        UUID creatureId = (UUID) getValue("lifeSource");
        Permanent creature = game.getPermanentOrLKIBattlefield(creatureId);
        if (creature != null) {
            int amount = creature.getToughness().getValue();
            Player player = game.getPlayer(source.getControllerId());
            if (player != null) {
                player.gainLife(amount, game);
            }
            return true;
        }
        return false;
    }
}