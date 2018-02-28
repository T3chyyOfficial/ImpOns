package com.techyydata.impons.apps;

/*
 * Script Writer Application class
 */

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.component.Label;
import net.minecraft.nbt.NBTTagCompound;

public class ApplicationScriptWriter extends Application {

    private Layout testLayout;

    @Override
    public void init() {
        testLayout = new Layout(0, 0, 100, 50);
        this.setCurrentLayout(testLayout);

    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
