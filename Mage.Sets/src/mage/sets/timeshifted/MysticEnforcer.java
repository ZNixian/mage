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
package mage.sets.timeshifted;

import java.util.UUID;
import mage.MageInt;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.CardsInControllerGraveCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.ProtectionAbility;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Rarity;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.predicate.mageobject.ColorPredicate;

/**
 *
 * @author LevelX2
 */
public class MysticEnforcer extends CardImpl {

    private static final FilterCard filter = new FilterCard("Black");

    static {
        filter.add(new ColorPredicate(ObjectColor.BLACK));
    }

    public MysticEnforcer(UUID ownerId) {
        super(ownerId, 96, "Mystic Enforcer", Rarity.SPECIAL, new CardType[]{CardType.CREATURE}, "{2}{G}{W}");
        this.expansionSetCode = "TSB";
        this.subtype.add("Human");
        this.subtype.add("Nomad");
        this.subtype.add("Mystic");

        this.color.setGreen(true);
        this.color.setWhite(true);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Protection from black
        this.addAbility(new ProtectionAbility(filter));
        // Threshold - As long as seven or more cards are in your graveyard, Mystic Enforcer gets +3/+3 and has flying.
        Ability thresholdAbility = new SimpleStaticAbility(
                Zone.BATTLEFIELD,
                new ConditionalContinuousEffect(
                    new BoostSourceEffect(3, 3, Duration.WhileOnBattlefield),
                    new CardsInControllerGraveCondition(7),
                    "<i>Threshold</i> - {this} gets +3/+3 as long as seven or more cards are in your graveyard"
                ));
        this.addAbility(thresholdAbility);
    }

    public MysticEnforcer(final MysticEnforcer card) {
        super(card);
    }

    @Override
    public MysticEnforcer copy() {
        return new MysticEnforcer(this);
    }
}
