package com.techyydata.impons.apps;

/*
 * Script Writer Application class
 */

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.component.Label;
import com.mrcrayfish.device.api.app.component.TextArea;
import net.minecraft.nbt.NBTTagCompound;

public class ApplicationScriptWriter extends Application {

    private Layout scriptLayout;
    private Label creditLabel;
    private TextArea scriptArea;

    @Override
    public void init() {
        scriptLayout = new Layout(0, 0, 250, 100);
        this.setCurrentLayout(scriptLayout);

        creditLabel = new Label("Script Writer created by TechyyMC", 6, 6);
        scriptLayout.addComponent(creditLabel);

        scriptArea = new TextArea(2, 2, 230, 70);
        scriptLayout.addComponent(scriptArea);

    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
