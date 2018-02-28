package com.techyydata.impons.apps;

import com.mrcrayfish.device.api.app.*;
import com.mrcrayfish.device.api.app.component.*;
import net.minecraft.nbt.NBTTagCompound;

public class ApplicationCrayOSAntivirus extends Application {

    private Layout crayLayout;
    private Label titleLabel;


    @Override
    public void init() {
        crayLayout = new Layout(0, 0, 200, 120);
        this.setCurrentLayout(crayLayout);

        titleLabel = new Label("CrayOS Antivirus", 76, 1);
        crayLayout.addComponent(titleLabel);
    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
