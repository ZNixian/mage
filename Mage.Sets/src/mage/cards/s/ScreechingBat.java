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
package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.condition.common.TransformedCondition;
import mage.abilities.costs.Cost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.decorator.ConditionalTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.TransformAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;

/**
 * @author nantuko
 */
public class ScreechingBat extends CardImpl {

    public ScreechingBat(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{B}");
        this.subtype.add("Bat");

        this.transformable = true;
        this.secondSideCardClazz = StalkingVampire.class;

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(FlyingAbility.getInstance());

        // At the beginning of your upkeep, you may pay {2}{B}{B}. If you do, transform Screeching Bat.
        this.addAbility(new TransformAbility());
        this.addAbility(new ConditionalTriggeredAbility(new ScreechingBatBeginningOfUpkeepTriggeredAbility(), new TransformedCondition(true), ""));
    }

    public ScreechingBat(final ScreechingBat card) {
        super(card);
    }

    @Override
    public ScreechingBat copy() {
        return new ScreechingBat(this);
    }
}

class ScreechingBatBeginningOfUpkeepTriggeredAbility extends TriggeredAbilityImpl {

    public ScreechingBatBeginningOfUpkeepTriggeredAbility() {
        super(Zone.BATTLEFIELD, new ScreechingBatTransformSourceEffect(), true);
    }

    public ScreechingBatBeginningOfUpkeepTriggeredAbility(final ScreechingBatBeginningOfUpkeepTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public ScreechingBatBeginningOfUpkeepTriggeredAbility copy() {
        return new ScreechingBatBeginningOfUpkeepTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == EventType.UPKEEP_STEP_PRE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        return event.getPlayerId().equals(this.controllerId);
    }

    @Override
    public String getRule() {
        return "At the beginning of your upkeep, you may pay {2}{B}{B}. If you do, transform {this}.";
    }
}

class ScreechingBatTransformSourceEffect extends OneShotEffect {

    public ScreechingBatTransformSourceEffect() {
        super(Outcome.Transform);
        staticText = "transform {this}";
    }

    public ScreechingBatTransformSourceEffect(final ScreechingBatTransformSourceEffect effect) {
        super(effect);
    }

    @Override
    public ScreechingBatTransformSourceEffect copy() {
        return new ScreechingBatTransformSourceEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent permanent = game.getPermanent(source.getSourceId());
        if (permanent != null) {
            Cost cost = new ManaCostsImpl("{2}{B}{B}");
            if (cost.pay(source, game, permanent.getControllerId(), permanent.getControllerId(), false, null)) {
                if (permanent.isTransformable()) {
                    permanent.setTransformed(!permanent.isTransformed());
                }
            }
            return true;
        }
        return false;
    }

}
