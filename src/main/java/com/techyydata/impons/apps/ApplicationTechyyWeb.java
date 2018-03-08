package com.techyydata.impons.apps;

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Layout;
import net.minecraft.nbt.NBTTagCompound;

public class ApplicationTechyyWeb extends Application {


    //Application Component Variables
    private Layout layout;

    @Override
    public void init() {
        layout = new Layout(0, 0, 225, 130);
        this.setCurrentLayout(layout);
    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
