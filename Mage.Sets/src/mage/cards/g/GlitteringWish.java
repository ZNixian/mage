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
package mage.cards.g;

import java.util.Set;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ExileSpellEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.predicate.mageobject.MulticoloredPredicate;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;

/**
 *
 * @author Plopman
 */
public class GlitteringWish extends CardImpl {

    public GlitteringWish(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{G}{W}");

        // You may choose a multicolored card you own from outside the game, reveal that card, and put it into your hand. Exile Glittering Wish.
        this.getSpellAbility().addEffect(new GlitteringWishEffect());
        this.getSpellAbility().addEffect(ExileSpellEffect.getInstance());
    }

    public GlitteringWish(final GlitteringWish card) {
        super(card);
    }

    @Override
    public GlitteringWish copy() {
        return new GlitteringWish(this);
    }
}

class GlitteringWishEffect extends OneShotEffect {

    private static final String choiceText = "Choose a multicolored card you own from outside the game (sideboard), and put it into your hand?";

    private static final FilterCard filter = new FilterCard("multicolored cards");

    static {
        filter.add(new MulticoloredPredicate());
    }

    public GlitteringWishEffect() {
        super(Outcome.Benefit);
        this.staticText = "You may choose a multicolored card you own from outside the game, reveal that card, and put it into your hand";
    }

    public GlitteringWishEffect(final GlitteringWishEffect effect) {
        super(effect);
    }

    @Override
    public GlitteringWishEffect copy() {
        return new GlitteringWishEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            while (controller.chooseUse(Outcome.Benefit, choiceText, source, game)) {
                Cards cards = controller.getSideboard();
                if (cards.isEmpty()) {
                    game.informPlayer(controller, "You have no cards outside the game.");
                    break;
                }

                Set<Card> filtered = cards.getCards(filter, game);
                if (filtered.isEmpty()) {
                    game.informPlayer(controller, "You have no " + filter.getMessage() + " outside the game (your sideboard).");
                    break;
                }

                Cards filteredCards = new CardsImpl();
                for (Card card : filtered) {
                    filteredCards.add(card.getId());
                }

                TargetCard target = new TargetCard(Zone.OUTSIDE, filter);
                if (controller.choose(Outcome.Benefit, filteredCards, target, game)) {
                    Card card = controller.getSideboard().get(target.getFirstTarget(), game);
                    if (card != null) {

                        card.moveToZone(Zone.HAND, source.getSourceId(), game, false);
                        Cards revealCard = new CardsImpl();
                        revealCard.add(card);
                        controller.revealCards("Glittering Wish", revealCard, game);
                        break;
                    }
                }
            }

        }
        return true;
    }

}
