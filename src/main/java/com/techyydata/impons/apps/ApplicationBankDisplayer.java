package com.techyydata.impons.apps;

/**
 * Bank Displayer Application Class
 * Author: TechyyMC
 */

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Layout;
import net.minecraft.nbt.NBTTagCompound;

public class ApplicationBankDisplayer extends Application {

    //Application Component Variables
    private Layout layout;


    //Application Component Init Method
    @Override
    public void init() {
        layout = new Layout(100, 100);
        this.setCurrentLayout(layout);

    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
