package dev.printer2;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;

public class Printer2Addon extends MeteorAddon {
    public static final Category CATEGORY = new Category("Printer2", Items.IRON_BLOCK.getDefaultStack());

    @Override
    public void onInitialize() {
        Modules.get().add(new Printer2Module());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "dev.printer2";
    }
}
