package AdditionCorrugated;

import net.minecraft.block.Block;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="Addition Corrugated", name="Addition Corrugated", version="1.5.1_MC1.7.2")
public class AdditionCorrugatedCore
{
	public static final CreativeTabs AdditionCorrugatedMODTab = new CreativeTabAdditionCorrugatedMOD("AdditionCorrugatedMODTab");
		
	public static final Block command_Block = (Blocks.command_block).setCreativeTab(CreativeTabs.tabRedstone);
	
	public static final Item command_block_minecart = (Items.command_block_minecart).setCreativeTab(CreativeTabs.tabTransport);
	
	public static Item.ToolMaterial CORRUGATED = EnumHelper.addToolMaterial("CORRUGATED", 0, 100, 1.0F, 1.0F, 1);
	
	public static Item.ToolMaterial STRONGCORRUGATED = EnumHelper.addToolMaterial("STRONGCORRUGATED", 2, 500, 3.0F, 1.F, 5);
	
	public static Block Corrugated;
	
	public static Block CorrugatedLight;
	
	public static Block StrongCorrugated;
	
	public static Block StrongCorrugatedLight;
	
	public static Block oreFluorite;
	
	public static Block TemperedGlass;
	
	public static Block TStone;
	
	public static Block oreTNT;
	
	public static Block oreAdamantite;
	
	public static Block oreCobalt;
	
	public static Block oreDemonite;
	
	public static Block oreHellstone;
	
	public static Block oreMeteorite;
	
	public static Block oreMythril;
	
	public static Block BlackStone;
	
	public static Block ACrecycle;
	
	public static Block CorrugatedTorch;
	
	public static Block StrongCorrugatedTorch;
	
	public static Item StrongPaper;
	
	public static Item RustyEdge;

	public static Item Edge;
	
	public static Item PolishngPowder;
	
	public static Item CorrugatedBoard;
	
	public static Item Cutter;
		
	public static Item Fluorite;
	
	public static Item StrongCorrugatedBoard;
	
	public static Item Gum;
	
	public static Item MintGum;
	
	public static Item SuperMintGum;
	
	public static Item ChocolateBar;
	
	public static Item Blueberry;
	
	public static Item PickledPlum;
	
	public static Item Plum;
	
	public static Item RiceCake;
	
	public static Item Adamantite;
	
	public static Item Cobalt;
	
	public static Item Demonite;
	
	public static Item Hellstone;
	
	public static Item Meteorite;
	
	public static Item Mythril;
	
	public static Item SolarFragment;
	
	public static Item GlutinousRice;
	
	public static Item Straw;
	
	public static Item SeaMustard;
	
	public static Item Dumpling;
	
	public static Item SoySauce;
	
	public static Item FermentedSoybeans;
	
	public static Item Soybeans;
	
	public static Item SpongeGourd;
	
	public static Item DrySpongeGourd;
	
	public static Item Kimchi;
	
	public static Item JapaneseLeek;

	public static Item Mustard;
	
	public static Item Capsicum;

	public static Item Rice;
	
	public static Item SeaMustardRevision;
	
	public static Item CorrugatedSword;
	
	public static Item StrongCorrugatedSword;
	
	public static Item CorrugatedHoe;
	
	public static Item StrongCorrugatedHoe;
	
	public static Item StrongCorrugatedShovel;
	
	public static Item CorrugatedShovel;
	
	public static Item StrongCorrugatedAxe;
	
	public static Item CorrugatedAxe;
	
	public static Item StrongCorrugatedPickaxe;
	
	public static Item CorrugatedPickaxe;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)	
	{
		Corrugated = new BlockCorrugated();
		
		CorrugatedLight = new BlockCorrugatedLight();
		
		StrongCorrugated = new BlockStrongCorrugated();
		
		StrongCorrugatedLight = new BlockStrongCorrugatedLight();
		
		BlackStone = new BlockBlackStone();
		
		TStone = new BlockTStone();
		
		oreTNT = new BlockoreTNT();
		
		oreAdamantite = new BlockoreAdamantite();
		
		oreCobalt = new BlockoreCobalt();
		
		oreDemonite = new BlockoreDemonite();
		
		oreHellstone = new BlockoreHellstone();
		
		oreMeteorite = new BlockoreMeteorite();
		
		oreMythril = new BlockoreMythril();
		
		oreFluorite = new BlockoreFluorite();
		
		TemperedGlass = new BlockTemperedGlass();
		
		ACrecycle = new BlockACrecycle();
		
		CorrugatedTorch = new BlockCorrugatedTorch();
		
		StrongCorrugatedTorch = new BlockStrongCorrugatedTorch();
		
		StrongPaper = (new Item())
				.setUnlocalizedName("StrongPaper")
				.setTextureName("additioncorrugated:item_strongpaper")
				.setMaxStackSize(64);
		
		RustyEdge = (new Item())
				.setUnlocalizedName("RustyEdge")
				.setTextureName("additioncorrugated:item_rustedge")
				.setMaxStackSize(64);
		
		Edge = (new Item())
				.setUnlocalizedName("Edge")
				.setTextureName("additioncorrugated:item_edge")
				.setMaxStackSize(64);
		
		PolishngPowder = (new Item())
				.setUnlocalizedName("PolishngPowder")
				.setTextureName("additioncorrugated:item_polishngpowder")
				.setMaxStackSize(64);
		
		CorrugatedBoard = (new Item())
				.setUnlocalizedName("CorrugatedBoard")
				.setTextureName("additioncorrugated:item_corrugatedboard")
				.setMaxStackSize(64);
		
		Cutter = (new Item())
				.setUnlocalizedName("Cutter")
				.setTextureName("additioncorrugated:item_cutter")
				.setMaxStackSize(1);
		
		Fluorite = (new Item())
				.setUnlocalizedName("Fluorite")
				.setTextureName("additioncorrugated:item_fluorite")
				.setMaxStackSize(64);
		
		StrongCorrugatedBoard = (new Item())
				.setUnlocalizedName("StrongCorrugatedBoard")
				.setTextureName("additioncorrugated:item_strongcorrugatedboard")
				.setMaxStackSize(64);
		
		Gum = (new ItemFood(4, 0.2F, false))
				.setUnlocalizedName("Gum")
				.setTextureName("additioncorrugated:item_gum")
				.setMaxStackSize(64);
		
		MintGum = (new ItemFood(5, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 60, 0, 0.75F)
				.setUnlocalizedName("MintGum")
				.setTextureName("additioncorrugated:item_mintgum")
				.setMaxStackSize(64);
		
		SuperMintGum = (new ItemFood(6, 0.2F, false))
				.setPotionEffect(Potion.nightVision.id, 300, 0, 0.75F)
				.setUnlocalizedName("SuperMintGum")
				.setTextureName("additioncorrugated:item_supermintgum")
				.setMaxStackSize(64);
		
		ChocolateBar = (new ItemFood(5, 0.5F, true))
				.setUnlocalizedName("ChocolateBar")
				.setTextureName("additioncorrugated:item_chocolatebar")
				.setMaxStackSize(64);
		
		Blueberry = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.nightVision.id, 300, 0, 0.5F)
				.setUnlocalizedName("Blueberry")
				.setTextureName("additioncorrugated:item_blueberry")
				.setMaxStackSize(64);
		
		PickledPlum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.jump.id, 60, 0, 0.75F)
				.setUnlocalizedName("PickledPlum")
				.setTextureName("additioncorrugated:item_PickledPlum")
				.setMaxStackSize(64);
		
		Plum = (new ItemFood(2, 0.2F, false))
				.setUnlocalizedName("Plum")
				.setTextureName("additioncorrugated:item_plum")
				.setMaxStackSize(64);
		
		RiceCake = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("RiceCake")
				.setTextureName("additioncorrugated:item_ricecake")
				.setMaxStackSize(64);
		
		SeaMustard = (new ItemFood(2, 0.5F, true))
				.setPotionEffect(Potion.waterBreathing.id, 60, 0, 1.0F)
				.setUnlocalizedName("SeaMustard")
				.setTextureName("additioncorrugated:item_seamustard")
				.setMaxStackSize(64);
		
		Adamantite = (new Item())
				.setUnlocalizedName("Adamantite")
				.setTextureName("additioncorrugated:item_ingotadamantite")
				.setMaxStackSize(64);
		
		Cobalt = (new Item())
				.setUnlocalizedName("Cobalt")
				.setTextureName("additioncorrugated:item_ingotcobalt")
				.setMaxStackSize(64);
		
		Demonite = (new Item())
				.setUnlocalizedName("Demonite")
				.setTextureName("additioncorrugated:item_ingotdemonite")
				.setMaxStackSize(64);
		
		Hellstone = (new Item())
				.setUnlocalizedName("Hellstone")
				.setTextureName("additioncorrugated:item_ingothellstone")
				.setMaxStackSize(64);
		
		Meteorite = (new Item())
				.setUnlocalizedName("Meteorite")
				.setTextureName("additioncorrugated:item_ingotmeteorite")
				.setMaxStackSize(64);
		
		Mythril = (new Item())
				.setUnlocalizedName("Mythril")
				.setTextureName("additioncorrugated:item_ingotmythril")
				.setMaxStackSize(64);
		
		SolarFragment = (new Item())
				.setUnlocalizedName("SolarFragment")
				.setTextureName("additioncorrugated:item_solarfragment")
				.setMaxStackSize(64);
		
		GlutinousRice = (new Item())
				.setUnlocalizedName("GlutinousRice")
				.setTextureName("additioncorrugated:item_glutinousrice")
				.setMaxStackSize(64);
		
		Straw = (new Item())
				.setUnlocalizedName("Straw")
				.setTextureName("additioncorrugated:item_straw")
				.setMaxStackSize(64);
		
		Dumpling = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Dumpling")
				.setTextureName("additioncorrugated:item_dumpling")
				.setMaxStackSize(64);
		
		SoySauce = (new ItemFood(1, 0.2F, false))
				.setUnlocalizedName("SoySauce")
				.setTextureName("additioncorrugated:item_soysauce")
				.setMaxStackSize(64);
		
		FermentedSoybeans = (new ItemFood(6, 0.5F, true))
				.setUnlocalizedName("FermentedSoybeans")
				.setTextureName("additioncorrugated:item_fermentedsoybeans")
				.setMaxStackSize(64);
		
		Soybeans = (new ItemFood(2, 0.2F, true))
				.setUnlocalizedName("Soybeans")
				.setTextureName("additioncorrugated:item_soybeans")
				.setMaxStackSize(64);
		
		SpongeGourd = (new Item())
				.setUnlocalizedName("SpongeGourd")
				.setTextureName("additioncorrugated:item_spongegourd")
				.setMaxStackSize(64);
		
		DrySpongeGourd = (new Item())
				.setUnlocalizedName("DrySpongeGourd")
				.setTextureName("additioncorrugated:item_dryspongegourd")
				.setMaxStackSize(64);
		
		Kimchi = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.regeneration.id, 30, 0, 1.0F)
				.setUnlocalizedName("Kimchi")
				.setTextureName("additioncorrugated:item_kimchi")
				.setMaxStackSize(64);
		
		JapaneseLeek = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.moveSpeed.id, 30, 0, 1.0F)
				.setUnlocalizedName("JapaneseLeek")
				.setTextureName("additioncorrugated:item_japaneseleek")
				.setMaxStackSize(64);
		
		Mustard = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.damageBoost.id, 30, 0, 1.0F)
				.setUnlocalizedName("Mustard")
				.setTextureName("additioncorrugated:item_mustard")
				.setMaxStackSize(64);
		
		Capsicum = (new ItemFood(4, 0.5F, true))
				.setPotionEffect(Potion.fireResistance.id, 30, 0, 1.0F)
				.setUnlocalizedName("Capsicum")
				.setTextureName("additioncorrugated:item_capsicum")
				.setMaxStackSize(64);
		
		Rice = (new ItemFood(4, 0.5F, true))
				.setUnlocalizedName("Rice")
				.setTextureName("additioncorrugated:item_rice")
				.setMaxStackSize(64);
		
		SeaMustardRevision = (new ItemFood(2, 0.2F, true))
				.setPotionEffect(Potion.waterBreathing.id, 300, 0, 1.0F)
				.setUnlocalizedName("SeaMustardRevision")
				.setTextureName("additioncorrugated:item_seamustardrevision")
				.setMaxStackSize(64);
		
		CorrugatedSword = (new ItemSword(CORRUGATED))
				.setUnlocalizedName("CorrugatedSword")
				.setTextureName("additioncorrugated:item_corrugatedsword")
				.setMaxStackSize(1);
		
		StrongCorrugatedSword = (new ItemSword(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedSword")
				.setTextureName("additioncorrugated:item_strongcorrugatedsword")
				.setMaxStackSize(1);
		
		CorrugatedHoe = (new ItemHoe(CORRUGATED))
				.setUnlocalizedName("CorrugatedHoe")
				.setTextureName("additioncorrugated:item_corrugatedhoe")
				.setMaxStackSize(1);
		
		StrongCorrugatedHoe = (new ItemHoe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedHoe")
				.setTextureName("additioncorrugated:item_strongcorrugatedhoe")
				.setMaxStackSize(1);
		
		StrongCorrugatedShovel = (new ItemSpade(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedShovel")
				.setTextureName("additioncorrugated:item_strongcorrugatedshovel")
				.setMaxStackSize(1);
		
		CorrugatedShovel = (new ItemSpade(CORRUGATED))
				.setUnlocalizedName("CorrugatedShovel")
				.setTextureName("additioncorrugated:item_corrugatedshovel")
				.setMaxStackSize(1);
		
		StrongCorrugatedAxe = (new ItemStrongCorrugatedAxe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedAxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedaxe")
				.setMaxStackSize(1);
		
		CorrugatedAxe = (new ItemCorrugatedAxe(CORRUGATED))
				.setUnlocalizedName("CorrugatedAxe")
				.setTextureName("additioncorrugated:item_corrugatedaxe")
				.setMaxStackSize(1);
		
		StrongCorrugatedPickaxe = (new ItemStrongCorrugatedPickaxe(STRONGCORRUGATED))
				.setUnlocalizedName("StrongCorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_strongcorrugatedpickaxe")
				.setMaxStackSize(1);
		
		CorrugatedPickaxe = (new ItemCorrugatedPickaxe(CORRUGATED))
				.setUnlocalizedName("CorrugatedPickaxe")
				.setTextureName("additioncorrugated:item_corrugatedpickaxe")
				.setMaxStackSize(1);
		
		GameRegistry.registerBlock(Corrugated, "Corrugated");
		
		GameRegistry.registerBlock(CorrugatedLight, "CorrugatedLight");
		
		GameRegistry.registerBlock(StrongCorrugated, "StrongCorrugated");
		
		GameRegistry.registerBlock(StrongCorrugatedLight, "StrongCorrugatedLight");
		
		GameRegistry.registerBlock(BlackStone, "BlackStone");
		
		GameRegistry.registerBlock(TStone, "TStone");
		
		GameRegistry.registerBlock(oreTNT, "oreTNT");
		
		GameRegistry.registerBlock(oreAdamantite, "oreAdamantite");
		
		GameRegistry.registerBlock(oreCobalt, "oreCobalt");
		
		GameRegistry.registerBlock(oreDemonite, "oreDemonite");
		
		GameRegistry.registerBlock(oreHellstone, "oreHellstone");
		
		GameRegistry.registerBlock(oreMeteorite, "oreMeteorite");
		
		GameRegistry.registerBlock(oreMythril, "oreMythril");
		
		GameRegistry.registerBlock(oreFluorite, "OreFruorite");
		
		GameRegistry.registerBlock(TemperedGlass, "TemperedGlass");
	
		GameRegistry.registerBlock(ACrecycle, "ACrecycle");
		
		GameRegistry.registerBlock(CorrugatedTorch, "CorrugatedTorch");
		
		GameRegistry.registerBlock(StrongCorrugatedTorch, "StrongCorrugatedTorch");
		
		GameRegistry.registerItem(StrongPaper, "itemStrongPaper");
		
		GameRegistry.registerItem(RustyEdge, "itemRustyEdge");
		
		GameRegistry.registerItem(Edge, "itemEdge");
		
		GameRegistry.registerItem(PolishngPowder, "itempolishngpowder");
		
		GameRegistry.registerItem(CorrugatedBoard, "itemCorrugatedBoard");
		
		GameRegistry.registerItem(Cutter, "itemCutter");
		
		GameRegistry.registerItem(Fluorite, "itemFluorite");
		
		GameRegistry.registerItem(StrongCorrugatedBoard, "itemStrongCorrugatedBoard");
		
		GameRegistry.registerItem(Gum, "Gum");
		
		GameRegistry.registerItem(MintGum, "MintGum");
		
		GameRegistry.registerItem(SuperMintGum, "SuperMintGum");
		
		GameRegistry.registerItem(ChocolateBar, "ChocolateBar");
		
		GameRegistry.registerItem(Blueberry, "Blueberry");
		
		GameRegistry.registerItem(PickledPlum, "PickledPlum");
		
		GameRegistry.registerItem(Plum, "Plum");
		
		GameRegistry.registerItem(RiceCake, "RiceCake");
		
		GameRegistry.registerItem(SeaMustard, "SeaMustard");
		
		GameRegistry.registerItem(Adamantite, "Adamantite");
		
		GameRegistry.registerItem(Cobalt, "Cobalt");
		
		GameRegistry.registerItem(Demonite, "Demonite");
		
		GameRegistry.registerItem(Hellstone, "Hellstone");
		
		GameRegistry.registerItem(Meteorite, "Meteorite");
		
		GameRegistry.registerItem(Mythril, "Mythril");
		
		GameRegistry.registerItem(SolarFragment, "SolarFragment");
		
		GameRegistry.registerItem(GlutinousRice, "GlutinousRice");
		
		GameRegistry.registerItem(Straw, "Straw");
		
		GameRegistry.registerItem(Dumpling, "Dumpling");
		
		GameRegistry.registerItem(SoySauce, "SoySauce");
		
		GameRegistry.registerItem(FermentedSoybeans, "FermentedSoybeans");
		
		GameRegistry.registerItem(Soybeans, "Soybeans");
		
		GameRegistry.registerItem(SpongeGourd, "SpongeGourd");
		
		GameRegistry.registerItem(DrySpongeGourd, "DrySpongeGourd");
		
		GameRegistry.registerItem(Kimchi, "Kimchi");
		
		GameRegistry.registerItem(JapaneseLeek, "JapaneseLeek");
		
		GameRegistry.registerItem(Mustard, "Mustard");
		
		GameRegistry.registerItem(Capsicum, "Capsicum");
		
		GameRegistry.registerItem(Rice, "Rice");
		
		GameRegistry.registerItem(SeaMustardRevision, "SeaMustardRevision");
		
		GameRegistry.registerItem(CorrugatedSword, "CorrugatedSword");
		
		GameRegistry.registerItem(StrongCorrugatedSword, "StrongCorrugatedSword");
		
		GameRegistry.registerItem(CorrugatedHoe, "CorrugatedHoe");
		
		GameRegistry.registerItem(StrongCorrugatedHoe, "StrongCorrugatedHoe");
		
		GameRegistry.registerItem(StrongCorrugatedShovel, "StrongCorrugatedShovel");
		
		GameRegistry.registerItem(CorrugatedShovel, "CorrugatedShovel");
		
		GameRegistry.registerItem(CorrugatedAxe, "CorrugatedAxe");
		
		GameRegistry.registerItem(StrongCorrugatedAxe, "StrongCorrugatedAxe");
		
		GameRegistry.registerItem(StrongCorrugatedPickaxe, "StrongCorrugatedPickaxe");
		
		GameRegistry.registerItem(CorrugatedPickaxe, "CorrugatedPickaxe");
		
		OreDictionary.registerOre("oreFluorite", new ItemStack(this.oreFluorite, 1, 0));
		
		OreDictionary.registerOre("gemFluorite", new ItemStack(this.Fluorite, 1, 0));
		
		OreDictionary.registerOre("oreTNT", new ItemStack(this.oreTNT, 1, 0));
		
		OreDictionary.registerOre("natto", new ItemStack(this.FermentedSoybeans, 1, 0));
		
		OreDictionary.registerOre("soybeans", new ItemStack(this.Soybeans, 1, 0));
		
		OreDictionary.registerOre("bottlesoysauce", new ItemStack(this.SoySauce, 1, 0));
		
		OreDictionary.registerOre("oreAdamantite", new ItemStack(this.oreAdamantite, 1, 0));
		
		OreDictionary.registerOre("oreCobalt", new ItemStack(this.oreCobalt, 1, 0));
		
		OreDictionary.registerOre("oreDemonite", new ItemStack(this.oreDemonite, 1, 0));
		
		OreDictionary.registerOre("oreHellstone", new ItemStack(this.oreHellstone, 1, 0));
		
		OreDictionary.registerOre("oreMeteorite", new ItemStack(this.oreMeteorite, 1, 0));
		
		OreDictionary.registerOre("oreMythril", new ItemStack(this.oreMythril, 1, 0));
		
		OreDictionary.registerOre("Adamantite", new ItemStack(this.Adamantite, 1, 0));
		
		OreDictionary.registerOre("Cobalt", new ItemStack(this.Cobalt, 1, 0));
		
		OreDictionary.registerOre("Demonite", new ItemStack(this.Demonite, 1, 0));
		
		OreDictionary.registerOre("Hellstone", new ItemStack(this.Hellstone, 1, 0));
		
		OreDictionary.registerOre("Meteorite", new ItemStack(this.Meteorite, 1, 0));
		
		OreDictionary.registerOre("Mythril", new ItemStack(this.Mythril, 1, 0));
		
		OreDictionary.registerOre("Rice", new ItemStack(this.Rice, 1, 0));
		
		OreDictionary.registerOre("JapaneseLeek", new ItemStack(this.JapaneseLeek, 1, 0));
		
		OreDictionary.registerOre("GlutinousRice", new ItemStack(this.GlutinousRice, 1, 0));
		
		OreDictionary.registerOre("RiceCake", new ItemStack(this.RiceCake, 1, 0));
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			config.load();
		}
		catch (Exception e)
		{
			FMLLog.severe("Error Message");
		}
		finally
		{
			config.save();
		}
		}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(Corrugated, 1),
		new Object[]{ "X X","X X","XXX",
				'X',Items.paper});
		
		GameRegistry.addRecipe(new ItemStack(Corrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',CorrugatedBoard});
		
		GameRegistry.addShapelessRecipe(new ItemStack(CorrugatedBoard, 9),
				new Object[]{
				new ItemStack(Corrugated,1)});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(CorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(Items.paper, 1, 0)}));
		
		GameRegistry.addRecipe(new ItemStack(StrongCorrugated, 1),
				new Object[]{ "X X","X X","XXX",
						'X',StrongPaper});
		
		GameRegistry.addRecipe(
				new ShapedOreRecipe(
				new ItemStack(StrongCorrugatedLight, 1, 0),
				new Object[]{"Y Y","YXY","YYY",
					Character.valueOf('X'),"gemFluorite",
					Character.valueOf('Y'), new ItemStack(StrongPaper, 1, 0)}));
		
		GameRegistry.addRecipe(new ItemStack(Cutter, 1),
				new Object[]{ "XYX","XYX","XYX",
						'X',Items.stick,'Y',Edge});
		
		GameRegistry.addShapelessRecipe(new ItemStack(StrongPaper, 1),
				new Object[]{
				new ItemStack(Items.paper,1),new ItemStack(Blocks.obsidian,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Edge, 1),
				new Object[]{
					new ItemStack(PolishngPowder,1),new ItemStack(RustyEdge,1)});
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(Edge, 1), 0.75F);
		
		GameRegistry.addSmelting(oreFluorite, new ItemStack(Fluorite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreAdamantite, new ItemStack(Adamantite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreCobalt, new ItemStack(Cobalt, 1), 0.99F);
		
		GameRegistry.addSmelting(oreDemonite, new ItemStack(Demonite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreHellstone, new ItemStack(Hellstone, 1), 0.99F);
		
		GameRegistry.addSmelting(oreMeteorite, new ItemStack(Meteorite, 1), 0.99F);
		
		GameRegistry.addSmelting(oreMythril, new ItemStack(Mythril, 1), 0.99F);
		
		GameRegistry.addRecipe(new ItemStack(StrongCorrugated, 1),
				new Object[]{ "XXX","XXX","XXX",
						'X',StrongCorrugatedBoard});
		
		GameRegistry.addShapelessRecipe(new ItemStack(StrongCorrugatedBoard, 9),
				new Object[]{
				new ItemStack(StrongCorrugated,1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(TemperedGlass, 1),
				new Object[]{
				new ItemStack(Blocks.glass,1),new ItemStack(Blocks.obsidian,1)});
		
		GameRegistry.addRecipe(new ItemStack(Gum, 1),
				new Object[]{ "XXX","YYY"," Z ",
						'X',Items.sugar,'Y',Items.wheat,'Z',Items.water_bucket});
		
		GameRegistry.addShapelessRecipe(new ItemStack(MintGum, 6),
				new Object[]{
				new ItemStack(Gum,1),new ItemStack(Items.gold_ingot,1)});
		
		GameRegistry.addRecipe(new ItemStack(SuperMintGum, 1),
				new Object[]{ " Y ","YXY"," Y ",
						'X',MintGum,'Y',Items.redstone});
		
		GameRegistry.addRecipe(new ItemStack(ChocolateBar, 1),
				new Object[]{ " X ","YZY","ZYZ",
						'X',Items.water_bucket,'Y',Items.sugar,'Z',new ItemStack(Items.blaze_powder, 1, 3)});
		
			GameRegistry.addShapelessRecipe(new ItemStack(TStone, 1),
			new Object[]{
				new ItemStack(Blocks.tnt,1),new ItemStack(Blocks.stone,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(RiceCake, 1),
					new Object[]{
					new ItemStack(GlutinousRice,1),new ItemStack(Items.water_bucket,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(PickledPlum, 1),
					new Object[]{
					new ItemStack(SolarFragment,1),new ItemStack(Items.water_bucket,1),new ItemStack(Plum,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(Straw, 1),
					new Object[]{
					new ItemStack(SolarFragment,1),new ItemStack(Items.wheat,1)});
			
			GameRegistry.addShapelessRecipe(new ItemStack(BlackStone, 1),
					new Object[]{
					new ItemStack(Blocks.stone,1),new ItemStack(Items.blaze_powder, 1, 0)});
			
			GameRegistry.addRecipe(new ItemStack(Dumpling, 1),
					new Object[]{ "X Y"," X ","  Z",
							'X',RiceCake,'Y',SoySauce,'Z',new ItemStack(Items.stick, 1)});
			
			GameRegistry.addRecipe(new ItemStack(FermentedSoybeans, 1),
					new Object[]{ " X "," Y "," Z ",
							'X',SoySauce,'Y',Soybeans,'Z',Straw});
			
			GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 1),
					new Object[]{ "XXX","XXX","XXX",
							'X',DrySpongeGourd});
			
			GameRegistry.addShapelessRecipe(new ItemStack(DrySpongeGourd, 1),
					new Object[]{
					new ItemStack(SpongeGourd,1),new ItemStack(SolarFragment, 1)});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedSword, 1),
					new Object[]{ " X "," X "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedAxe, 1),
					new Object[]{ "XX ","XY "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedPickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedPickaxe, 1),
					new Object[]{ "XXX"," Y "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedShovel, 1),
					new Object[]{ " X "," Y "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',Corrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedHoe, 1),
					new Object[]{ "XX "," Y "," Y ",
							'X',StrongCorrugated,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(CorrugatedTorch, 1),
					new Object[]{ "X","Y",
							'X',CorrugatedLight,'Y',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(StrongCorrugatedTorch, 1),
					new Object[]{ "X","Y",
							'X',StrongCorrugatedLight,'Y',Items.stick});
			
			CorrugatedBoard = (CorrugatedBoard).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedBoard = (StrongCorrugatedBoard).setCreativeTab(AdditionCorrugatedMODTab);
			
			Cutter = (Cutter).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongPaper = (StrongPaper).setCreativeTab(AdditionCorrugatedMODTab);
			
			RustyEdge = (RustyEdge).setCreativeTab(AdditionCorrugatedMODTab);
			
			PolishngPowder = (PolishngPowder).setCreativeTab(AdditionCorrugatedMODTab);
			
			Edge = (Edge).setCreativeTab(AdditionCorrugatedMODTab);
			
			Fluorite = (Fluorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Corrugated = (Corrugated).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreFluorite = (oreFluorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedLight = (CorrugatedLight).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugated = (StrongCorrugated).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedLight = (StrongCorrugatedLight).setCreativeTab(AdditionCorrugatedMODTab);
			
			TemperedGlass = (TemperedGlass).setCreativeTab(AdditionCorrugatedMODTab);
			
			Gum = (Gum).setCreativeTab(AdditionCorrugatedMODTab);
			
			MintGum = (MintGum).setCreativeTab(AdditionCorrugatedMODTab);
			
			SuperMintGum = (SuperMintGum).setCreativeTab(AdditionCorrugatedMODTab);
			
			ChocolateBar = (ChocolateBar).setCreativeTab(AdditionCorrugatedMODTab);
			
			TStone = (TStone).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreTNT = (oreTNT).setCreativeTab(AdditionCorrugatedMODTab);
			
			Blueberry = (Blueberry).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreAdamantite = (oreAdamantite).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreCobalt = (oreCobalt).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreDemonite = (oreDemonite).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreHellstone = (oreHellstone).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreMeteorite = (oreMeteorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			oreMythril = (oreMythril).setCreativeTab(AdditionCorrugatedMODTab);
			
			PickledPlum = (PickledPlum).setCreativeTab(AdditionCorrugatedMODTab);
			
			Plum = (Plum).setCreativeTab(AdditionCorrugatedMODTab);
			
			RiceCake = (RiceCake).setCreativeTab(AdditionCorrugatedMODTab);
			
			Adamantite = (Adamantite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Cobalt = (Cobalt).setCreativeTab(AdditionCorrugatedMODTab);
			
			Demonite = (Demonite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Hellstone = (Hellstone).setCreativeTab(AdditionCorrugatedMODTab);
			
			Meteorite = (Meteorite).setCreativeTab(AdditionCorrugatedMODTab);
			
			Mythril = (Mythril).setCreativeTab(AdditionCorrugatedMODTab);
			
			SolarFragment = (SolarFragment).setCreativeTab(AdditionCorrugatedMODTab);
			
			GlutinousRice = (GlutinousRice).setCreativeTab(AdditionCorrugatedMODTab);
			
			Straw = (Straw).setCreativeTab(AdditionCorrugatedMODTab);
			
			BlackStone = (BlackStone).setCreativeTab(AdditionCorrugatedMODTab);
			
			SeaMustard = (SeaMustard).setCreativeTab(AdditionCorrugatedMODTab);
			
			Dumpling = (Dumpling).setCreativeTab(AdditionCorrugatedMODTab);
			
			SoySauce = (SoySauce).setCreativeTab(AdditionCorrugatedMODTab);
			
			FermentedSoybeans = (FermentedSoybeans).setCreativeTab(AdditionCorrugatedMODTab);
			
			Soybeans = (Soybeans).setCreativeTab(AdditionCorrugatedMODTab);
			
			SpongeGourd = (SpongeGourd).setCreativeTab(AdditionCorrugatedMODTab);
			
			DrySpongeGourd = (DrySpongeGourd).setCreativeTab(AdditionCorrugatedMODTab);
			
			Kimchi = (Kimchi).setCreativeTab(AdditionCorrugatedMODTab);
			
			JapaneseLeek = (JapaneseLeek).setCreativeTab(AdditionCorrugatedMODTab);
			
			Mustard = (Mustard).setCreativeTab(AdditionCorrugatedMODTab);
			
			Capsicum = (Capsicum).setCreativeTab(AdditionCorrugatedMODTab);
			
			Rice = (Rice).setCreativeTab(AdditionCorrugatedMODTab);
			
			SeaMustardRevision = (SeaMustardRevision).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedSword = (CorrugatedSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedSword = (StrongCorrugatedSword).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedHoe = (StrongCorrugatedHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedHoe = (CorrugatedHoe).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedShovel = (StrongCorrugatedShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedShovel = (CorrugatedShovel).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedAxe = (StrongCorrugatedAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedAxe = (CorrugatedAxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedPickaxe = (StrongCorrugatedPickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedPickaxe = (CorrugatedPickaxe).setCreativeTab(AdditionCorrugatedMODTab);
			
			ACrecycle = (ACrecycle).setCreativeTab(AdditionCorrugatedMODTab);
			
			CorrugatedTorch = (CorrugatedTorch).setCreativeTab(AdditionCorrugatedMODTab);
			
			StrongCorrugatedTorch = (StrongCorrugatedTorch).setCreativeTab(AdditionCorrugatedMODTab);
			
			GameRegistry.registerWorldGenerator(new BlockoreFluorite(), 7);
			
			GameRegistry.registerWorldGenerator(new BlockoreTNT(), 8);
			
			GameRegistry.registerWorldGenerator(new BlockBlackStone(), 9);
			
			GameRegistry.registerWorldGenerator(new BlockoreAdamantite(), 6);
			
			GameRegistry.registerWorldGenerator(new BlockoreCobalt(), 5);
			
			GameRegistry.registerWorldGenerator(new BlockoreMythril(), 4);
			
			GameRegistry.registerWorldGenerator(new BlockoreDemonite(), 3);
			
			GameRegistry.registerWorldGenerator(new BlockoreHellstone(), 2);
			
			GameRegistry.registerWorldGenerator(new BlockoreMeteorite(), 1);
	
			MinecraftForge.EVENT_BUS.register(new DropPolishngPowder());
			
			MinecraftForge.EVENT_BUS.register(new DropRustyEdge());
			
			MinecraftForge.EVENT_BUS.register(new DropFluorite());
			
			MinecraftForge.EVENT_BUS.register(new DropSolarFragment());
	}
}