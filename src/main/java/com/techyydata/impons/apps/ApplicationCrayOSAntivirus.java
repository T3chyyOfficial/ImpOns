package com.techyydata.impons.apps;

import com.mrcrayfish.device.api.app.*;
import com.mrcrayfish.device.api.app.component.*;
import net.minecraft.nbt.NBTTagCompound;

public class ApplicationCrayOSAntivirus extends Application {

    //Application Variables
    private Layout crayLayout;
    private Label titleLabel;
    private Button scanButton;
    private Layout scanningLayout;


    //Application implementation
    @Override
    public void init() {
        crayLayout = new Layout(0, 0, 200, 120);
        this.setCurrentLayout(crayLayout);

        titleLabel = new Label("CrayOS Antivirus", 55, 1);
        crayLayout.addComponent(titleLabel);

        scanButton = new Button(55, 95, "Scan for viruses");
        scanButton.setSize(63, 20);
        scanButton.setClickListener((mouseX, mouseY, mouseButton) -> {
                    if (mouseButton == 0) {
                        this.setCurrentLayout(scanningLayout);
                    }
                });
        crayLayout.addComponent(scanButton);

        scanningLayout = new Layout(0, 0, 45, 30);
    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
