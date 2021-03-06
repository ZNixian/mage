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
package mage.cards.h;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.DealtDamageToSourceTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.keyword.DeathtouchAbility;
import mage.abilities.keyword.DefenderAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.permanent.token.Token;
import mage.players.Player;

/**
 *
 * @author LevelX2
 */
public class HornetNest extends CardImpl {

    public HornetNest(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{G}");
        this.subtype.add("Insect");

        this.power = new MageInt(0);
        this.toughness = new MageInt(2);

        // Defender
        this.addAbility(DefenderAbility.getInstance());
        // Whenever Hornet Nest is dealt damage, put that many 1/1 green Insect creature tokens with flying and deathtouch onto the battlefield.
        this.addAbility(new DealtDamageToSourceTriggeredAbility(Zone.BATTLEFIELD, new HornetNestDealDamageEffect(), false));
    }

    public HornetNest(final HornetNest card) {
        super(card);
    }

    @Override
    public HornetNest copy() {
        return new HornetNest(this);
    }
}

class HornetNestDealDamageEffect extends OneShotEffect {

    public HornetNestDealDamageEffect() {
        super(Outcome.Damage);
        this.staticText = "put that many 1/1 green Insect creature tokens with flying and deathtouch onto the battlefield";
    }

    public HornetNestDealDamageEffect(final HornetNestDealDamageEffect effect) {
        super(effect);
    }

    @Override
    public HornetNestDealDamageEffect copy() {
        return new HornetNestDealDamageEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player != null) {
            int amount = (Integer) getValue("damage");
            if (amount > 0) {
                return new CreateTokenEffect(new HornetNestInsectToken(), amount).apply(game, source);
            }
        }
        return false;
    }
}

class HornetNestInsectToken extends Token {

    public HornetNestInsectToken() {
        super("Insect", "1/1 green Insect creature tokens with flying and deathtouch");
        setOriginalExpansionSetCode("M15");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add("Insect");
        power = new MageInt(1);
        toughness = new MageInt(1);
        
        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(DeathtouchAbility.getInstance());
    }
}
