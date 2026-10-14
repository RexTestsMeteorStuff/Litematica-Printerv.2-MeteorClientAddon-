package dev.printer2;

import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;

public class Printer2Module extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    public final Setting<Double> reach = sgGeneral.add(new DoubleSetting.Builder()
        .name("reach")
        .description("Client-side interaction reach override in blocks.")
        .defaultValue(10.0)
        .min(1.0)
        .max(10.0)
        .sliderMin(1.0)
        .sliderMax(10.0)
        .build()
    );

    public Printer2Module() {
        super(Printer2Addon.CATEGORY, "litematica-printer2", "Provides a configurable reach override to use alongside Litematica Printer.");
    }

    @Override
    public void onActivate() {
        Printer2State.enabled = true;
        Printer2State.reach = reach.get();
    }

    @Override
    public void onDeactivate() {
        Printer2State.enabled = false;
    }

    @Override
    public void onTick() {
        Printer2State.reach = reach.get();
    }
}
