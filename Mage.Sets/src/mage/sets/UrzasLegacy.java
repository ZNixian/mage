/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author noxx
 */
public class UrzasLegacy extends ExpansionSet {

    private static final UrzasLegacy fINSTANCE = new UrzasLegacy();

    public static UrzasLegacy getInstance() {
        return fINSTANCE;
    }

    private UrzasLegacy() {
        super("Urza's Legacy", "ULG", ExpansionSet.buildDate(1999, 3, 6), SetType.EXPANSION);
        this.blockName = "Urza";
        this.parentSet = UrzasSaga.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("About Face", 73, Rarity.COMMON, mage.cards.a.AboutFace.class));
        cards.add(new SetCardInfo("Angelic Curator", 1, Rarity.COMMON, mage.cards.a.AngelicCurator.class));
        cards.add(new SetCardInfo("Angel's Trumpet", 121, Rarity.UNCOMMON, mage.cards.a.AngelsTrumpet.class));
        cards.add(new SetCardInfo("Anthroplasm", 25, Rarity.RARE, mage.cards.a.Anthroplasm.class));
        cards.add(new SetCardInfo("Archivist", 26, Rarity.RARE, mage.cards.a.Archivist.class));
        cards.add(new SetCardInfo("Aura Flux", 27, Rarity.COMMON, mage.cards.a.AuraFlux.class));
        cards.add(new SetCardInfo("Avalanche Riders", 74, Rarity.UNCOMMON, mage.cards.a.AvalancheRiders.class));
        cards.add(new SetCardInfo("Beast of Burden", 122, Rarity.RARE, mage.cards.b.BeastOfBurden.class));
        cards.add(new SetCardInfo("Blessed Reversal", 2, Rarity.RARE, mage.cards.b.BlessedReversal.class));
        cards.add(new SetCardInfo("Bloated Toad", 97, Rarity.UNCOMMON, mage.cards.b.BloatedToad.class));
        cards.add(new SetCardInfo("Bone Shredder", 49, Rarity.UNCOMMON, mage.cards.b.BoneShredder.class));
        cards.add(new SetCardInfo("Bouncing Beebles", 28, Rarity.COMMON, mage.cards.b.BouncingBeebles.class));
        cards.add(new SetCardInfo("Brink of Madness", 50, Rarity.RARE, mage.cards.b.BrinkOfMadness.class));
        cards.add(new SetCardInfo("Burst of Energy", 3, Rarity.COMMON, mage.cards.b.BurstOfEnergy.class));
        cards.add(new SetCardInfo("Cessation", 4, Rarity.COMMON, mage.cards.c.Cessation.class));
        cards.add(new SetCardInfo("Cloud of Faeries", 29, Rarity.COMMON, mage.cards.c.CloudOfFaeries.class));
        cards.add(new SetCardInfo("Crawlspace", 123, Rarity.RARE, mage.cards.c.Crawlspace.class));
        cards.add(new SetCardInfo("Crop Rotation", 98, Rarity.COMMON, mage.cards.c.CropRotation.class));
        cards.add(new SetCardInfo("Darkwatch Elves", 99, Rarity.UNCOMMON, mage.cards.d.DarkwatchElves.class));
        cards.add(new SetCardInfo("Defender of Chaos", 75, Rarity.COMMON, mage.cards.d.DefenderOfChaos.class));
        cards.add(new SetCardInfo("Defender of Law", 5, Rarity.COMMON, mage.cards.d.DefenderOfLaw.class));
        cards.add(new SetCardInfo("Defense Grid", 125, Rarity.RARE, mage.cards.d.DefenseGrid.class));
        cards.add(new SetCardInfo("Defense of the Heart", 100, Rarity.RARE, mage.cards.d.DefenseOfTheHeart.class));
        cards.add(new SetCardInfo("Delusions of Mediocrity", 30, Rarity.RARE, mage.cards.d.DelusionsOfMediocrity.class));
        cards.add(new SetCardInfo("Deranged Hermit", 101, Rarity.RARE, mage.cards.d.DerangedHermit.class));
        cards.add(new SetCardInfo("Devout Harpist", 6, Rarity.COMMON, mage.cards.d.DevoutHarpist.class));
        cards.add(new SetCardInfo("Engineered Plague", 51, Rarity.UNCOMMON, mage.cards.e.EngineeredPlague.class));
        cards.add(new SetCardInfo("Erase", 7, Rarity.COMMON, mage.cards.e.Erase.class));
        cards.add(new SetCardInfo("Eviscerator", 52, Rarity.RARE, mage.cards.e.Eviscerator.class));
        cards.add(new SetCardInfo("Expendable Troops", 8, Rarity.COMMON, mage.cards.e.ExpendableTroops.class));
        cards.add(new SetCardInfo("Faerie Conclave", 139, Rarity.UNCOMMON, mage.cards.f.FaerieConclave.class));
        cards.add(new SetCardInfo("Fleeting Image", 31, Rarity.RARE, mage.cards.f.FleetingImage.class));
        cards.add(new SetCardInfo("Fog of Gnats", 53, Rarity.COMMON, mage.cards.f.FogOfGnats.class));
        cards.add(new SetCardInfo("Forbidding Watchtower", 140, Rarity.UNCOMMON, mage.cards.f.ForbiddingWatchtower.class));
        cards.add(new SetCardInfo("Frantic Search", 32, Rarity.COMMON, mage.cards.f.FranticSearch.class));
        cards.add(new SetCardInfo("Gang of Elk", 102, Rarity.UNCOMMON, mage.cards.g.GangOfElk.class));
        cards.add(new SetCardInfo("Ghitu Encampment", 141, Rarity.UNCOMMON, mage.cards.g.GhituEncampment.class));
        cards.add(new SetCardInfo("Ghitu Fire-Eater", 76, Rarity.UNCOMMON, mage.cards.g.GhituFireEater.class));
        cards.add(new SetCardInfo("Ghitu Slinger", 77, Rarity.COMMON, mage.cards.g.GhituSlinger.class));
        cards.add(new SetCardInfo("Ghitu War Cry", 78, Rarity.UNCOMMON, mage.cards.g.GhituWarCry.class));
        cards.add(new SetCardInfo("Giant Cockroach", 54, Rarity.COMMON, mage.cards.g.GiantCockroach.class));
        cards.add(new SetCardInfo("Goblin Medics", 79, Rarity.COMMON, mage.cards.g.GoblinMedics.class));
        cards.add(new SetCardInfo("Goblin Welder", 80, Rarity.RARE, mage.cards.g.GoblinWelder.class));
        cards.add(new SetCardInfo("Granite Grip", 81, Rarity.COMMON, mage.cards.g.GraniteGrip.class));
        cards.add(new SetCardInfo("Grim Monolith", 126, Rarity.RARE, mage.cards.g.GrimMonolith.class));
        cards.add(new SetCardInfo("Harmonic Convergence", 103, Rarity.UNCOMMON, mage.cards.h.HarmonicConvergence.class));
        cards.add(new SetCardInfo("Hidden Gibbons", 104, Rarity.RARE, mage.cards.h.HiddenGibbons.class));
        cards.add(new SetCardInfo("Hope and Glory", 9, Rarity.UNCOMMON, mage.cards.h.HopeAndGlory.class));
        cards.add(new SetCardInfo("Impending Disaster", 82, Rarity.RARE, mage.cards.i.ImpendingDisaster.class));
        cards.add(new SetCardInfo("Intervene", 33, Rarity.COMMON, mage.cards.i.Intervene.class));
        cards.add(new SetCardInfo("Iron Maiden", 127, Rarity.RARE, mage.cards.i.IronMaiden.class));
        cards.add(new SetCardInfo("Iron Will", 10, Rarity.COMMON, mage.cards.i.IronWill.class));
        cards.add(new SetCardInfo("Jhoira's Toolbox", 128, Rarity.UNCOMMON, mage.cards.j.JhoirasToolbox.class));
        cards.add(new SetCardInfo("Karmic Guide", 11, Rarity.RARE, mage.cards.k.KarmicGuide.class));
        cards.add(new SetCardInfo("King Crab", 34, Rarity.UNCOMMON, mage.cards.k.KingCrab.class));
        cards.add(new SetCardInfo("Knighthood", 12, Rarity.UNCOMMON, mage.cards.k.Knighthood.class));
        cards.add(new SetCardInfo("Last-Ditch Effort", 83, Rarity.UNCOMMON, mage.cards.l.LastDitchEffort.class));
        cards.add(new SetCardInfo("Lava Axe", 84, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Levitation", 35, Rarity.UNCOMMON, mage.cards.l.Levitation.class));
        cards.add(new SetCardInfo("Lone Wolf", 105, Rarity.UNCOMMON, mage.cards.l.LoneWolf.class));
        cards.add(new SetCardInfo("Martyr's Cause", 13, Rarity.UNCOMMON, mage.cards.m.MartyrsCause.class));
        cards.add(new SetCardInfo("Memory Jar", 129, Rarity.RARE, mage.cards.m.MemoryJar.class));
        cards.add(new SetCardInfo("Might of Oaks", 106, Rarity.RARE, mage.cards.m.MightOfOaks.class));
        cards.add(new SetCardInfo("Miscalculation", 36, Rarity.COMMON, mage.cards.m.Miscalculation.class));
        cards.add(new SetCardInfo("Molten Hydra", 85, Rarity.RARE, mage.cards.m.MoltenHydra.class));
        cards.add(new SetCardInfo("Mother of Runes", 14, Rarity.UNCOMMON, mage.cards.m.MotherOfRunes.class));
        cards.add(new SetCardInfo("Multani, Maro-Sorcerer", 107, Rarity.RARE, mage.cards.m.MultaniMaroSorcerer.class));
        cards.add(new SetCardInfo("Multani's Acolyte", 108, Rarity.COMMON, mage.cards.m.MultanisAcolyte.class));
        cards.add(new SetCardInfo("No Mercy", 56, Rarity.RARE, mage.cards.n.NoMercy.class));
        cards.add(new SetCardInfo("Opal Champion", 16, Rarity.COMMON, mage.cards.o.OpalChampion.class));
        cards.add(new SetCardInfo("Opportunity", 37, Rarity.UNCOMMON, mage.cards.o.Opportunity.class));
        cards.add(new SetCardInfo("Ostracize", 57, Rarity.COMMON, mage.cards.o.Ostracize.class));
        cards.add(new SetCardInfo("Palinchron", 38, Rarity.RARE, mage.cards.p.Palinchron.class));
        cards.add(new SetCardInfo("Parch", 86, Rarity.COMMON, mage.cards.p.Parch.class));
        cards.add(new SetCardInfo("Peace and Quiet", 17, Rarity.UNCOMMON, mage.cards.p.PeaceAndQuiet.class));
        cards.add(new SetCardInfo("Phyrexian Broodlings", 58, Rarity.COMMON, mage.cards.p.PhyrexianBroodlings.class));
        cards.add(new SetCardInfo("Phyrexian Debaser", 59, Rarity.COMMON, mage.cards.p.PhyrexianDebaser.class));
        cards.add(new SetCardInfo("Phyrexian Defiler", 60, Rarity.UNCOMMON, mage.cards.p.PhyrexianDefiler.class));
        cards.add(new SetCardInfo("Phyrexian Denouncer", 61, Rarity.COMMON, mage.cards.p.PhyrexianDenouncer.class));
        cards.add(new SetCardInfo("Phyrexian Plaguelord", 62, Rarity.RARE, mage.cards.p.PhyrexianPlaguelord.class));
        cards.add(new SetCardInfo("Phyrexian Reclamation", 63, Rarity.UNCOMMON, mage.cards.p.PhyrexianReclamation.class));
        cards.add(new SetCardInfo("Plague Beetle", 64, Rarity.COMMON, mage.cards.p.PlagueBeetle.class));
        cards.add(new SetCardInfo("Planar Collapse", 18, Rarity.RARE, mage.cards.p.PlanarCollapse.class));
        cards.add(new SetCardInfo("Purify", 19, Rarity.RARE, mage.cards.p.Purify.class));
        cards.add(new SetCardInfo("Pygmy Pyrosaur", 87, Rarity.COMMON, mage.cards.p.PygmyPyrosaur.class));
        cards.add(new SetCardInfo("Pyromancy", 88, Rarity.RARE, mage.cards.p.Pyromancy.class));
        cards.add(new SetCardInfo("Quicksilver Amulet", 130, Rarity.RARE, mage.cards.q.QuicksilverAmulet.class));
        cards.add(new SetCardInfo("Rack and Ruin", 89, Rarity.UNCOMMON, mage.cards.r.RackAndRuin.class));
        cards.add(new SetCardInfo("Radiant, Archangel", 20, Rarity.RARE, mage.cards.r.RadiantArchangel.class));
        cards.add(new SetCardInfo("Radiant's Dragoons", 21, Rarity.UNCOMMON, mage.cards.r.RadiantsDragoons.class));
        cards.add(new SetCardInfo("Radiant's Judgment", 22, Rarity.COMMON, mage.cards.r.RadiantsJudgment.class));
        cards.add(new SetCardInfo("Rancor", 110, Rarity.COMMON, mage.cards.r.Rancor.class));
        cards.add(new SetCardInfo("Rank and File", 65, Rarity.UNCOMMON, mage.cards.r.RankAndFile.class));
        cards.add(new SetCardInfo("Raven Familiar", 39, Rarity.UNCOMMON, mage.cards.r.RavenFamiliar.class));
        cards.add(new SetCardInfo("Rebuild", 40, Rarity.UNCOMMON, mage.cards.r.Rebuild.class));
        cards.add(new SetCardInfo("Repopulate", 111, Rarity.COMMON, mage.cards.r.Repopulate.class));
        cards.add(new SetCardInfo("Ring of Gix", 131, Rarity.RARE, mage.cards.r.RingOfGix.class));
        cards.add(new SetCardInfo("Rivalry", 90, Rarity.RARE, mage.cards.r.Rivalry.class));
        cards.add(new SetCardInfo("Scrapheap", 132, Rarity.RARE, mage.cards.s.Scrapheap.class));
        cards.add(new SetCardInfo("Second Chance", 41, Rarity.RARE, mage.cards.s.SecondChance.class));
        cards.add(new SetCardInfo("Shivan Phoenix", 91, Rarity.RARE, mage.cards.s.ShivanPhoenix.class));
        cards.add(new SetCardInfo("Sick and Tired", 66, Rarity.COMMON, mage.cards.s.SickAndTired.class));
        cards.add(new SetCardInfo("Silk Net", 112, Rarity.COMMON, mage.cards.s.SilkNet.class));
        cards.add(new SetCardInfo("Simian Grunts", 113, Rarity.COMMON, mage.cards.s.SimianGrunts.class));
        cards.add(new SetCardInfo("Sleeper's Guile", 67, Rarity.COMMON, mage.cards.s.SleepersGuile.class));
        cards.add(new SetCardInfo("Slow Motion", 42, Rarity.COMMON, mage.cards.s.SlowMotion.class));
        cards.add(new SetCardInfo("Sluggishness", 92, Rarity.COMMON, mage.cards.s.Sluggishness.class));
        cards.add(new SetCardInfo("Snap", 43, Rarity.COMMON, mage.cards.s.Snap.class));
        cards.add(new SetCardInfo("Spawning Pool", 142, Rarity.UNCOMMON, mage.cards.s.SpawningPool.class));
        cards.add(new SetCardInfo("Subversion", 68, Rarity.RARE, mage.cards.s.Subversion.class));
        cards.add(new SetCardInfo("Sustainer of the Realm", 23, Rarity.UNCOMMON, mage.cards.s.SustainerOfTheRealm.class));
        cards.add(new SetCardInfo("Swat", 69, Rarity.COMMON, mage.cards.s.Swat.class));
        cards.add(new SetCardInfo("Tethered Skirge", 70, Rarity.UNCOMMON, mage.cards.t.TetheredSkirge.class));
        cards.add(new SetCardInfo("Thornwind Faeries", 44, Rarity.COMMON, mage.cards.t.ThornwindFaeries.class));
        cards.add(new SetCardInfo("Thran Lens", 133, Rarity.RARE, mage.cards.t.ThranLens.class));
        cards.add(new SetCardInfo("Thran War Machine", 134, Rarity.UNCOMMON, mage.cards.t.ThranWarMachine.class));
        cards.add(new SetCardInfo("Thran Weaponry", 135, Rarity.RARE, mage.cards.t.ThranWeaponry.class));
        cards.add(new SetCardInfo("Ticking Gnomes", 136, Rarity.UNCOMMON, mage.cards.t.TickingGnomes.class));
        cards.add(new SetCardInfo("Tinker", 45, Rarity.UNCOMMON, mage.cards.t.Tinker.class));
        cards.add(new SetCardInfo("Tragic Poet", 24, Rarity.COMMON, mage.cards.t.TragicPoet.class));
        cards.add(new SetCardInfo("Treefolk Mystic", 114, Rarity.COMMON, mage.cards.t.TreefolkMystic.class));
        cards.add(new SetCardInfo("Treetop Village", 143, Rarity.UNCOMMON, mage.cards.t.TreetopVillage.class));
        cards.add(new SetCardInfo("Unearth", 72, Rarity.COMMON, mage.cards.u.Unearth.class));
        cards.add(new SetCardInfo("Urza's Blueprints", 137, Rarity.RARE, mage.cards.u.UrzasBlueprints.class));
        cards.add(new SetCardInfo("Viashino Cutthroat", 94, Rarity.UNCOMMON, mage.cards.v.ViashinoCutthroat.class));
        cards.add(new SetCardInfo("Viashino Heretic", 95, Rarity.UNCOMMON, mage.cards.v.ViashinoHeretic.class));
        cards.add(new SetCardInfo("Viashino Sandscout", 96, Rarity.COMMON, mage.cards.v.ViashinoSandscout.class));
        cards.add(new SetCardInfo("Vigilant Drake", 46, Rarity.COMMON, mage.cards.v.VigilantDrake.class));
        cards.add(new SetCardInfo("Weatherseed Elf", 115, Rarity.COMMON, mage.cards.w.WeatherseedElf.class));
        cards.add(new SetCardInfo("Weatherseed Faeries", 48, Rarity.COMMON, mage.cards.w.WeatherseedFaeries.class));
        cards.add(new SetCardInfo("Weatherseed Treefolk", 116, Rarity.RARE, mage.cards.w.WeatherseedTreefolk.class));
        cards.add(new SetCardInfo("Wheel of Torture", 138, Rarity.RARE, mage.cards.w.WheelOfTorture.class));
        cards.add(new SetCardInfo("Wing Snare", 117, Rarity.UNCOMMON, mage.cards.w.WingSnare.class));
        cards.add(new SetCardInfo("Yavimaya Granger", 118, Rarity.COMMON, mage.cards.y.YavimayaGranger.class));
        cards.add(new SetCardInfo("Yavimaya Scion", 119, Rarity.COMMON, mage.cards.y.YavimayaScion.class));
        cards.add(new SetCardInfo("Yavimaya Wurm", 120, Rarity.COMMON, mage.cards.y.YavimayaWurm.class));
    }
}
