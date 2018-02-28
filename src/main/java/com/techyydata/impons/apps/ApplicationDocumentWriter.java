package com.techyydata.impons.apps;

import net.minecraft.nbt.NBTTagCompound;

import com.mrcrayfish.device.api.app.*;
import com.mrcrayfish.device.api.app.component.*;

public class ApplicationDocumentWriter extends Application {

    private Layout scriptLayout;
    private Label creditLabel;
    private TextArea scriptArea;
    private TextField scriptTitle;

    @Override
    public void init() {
        scriptLayout = new Layout(0, 0, 225, 120);
        this.setCurrentLayout(scriptLayout);

        creditLabel = new Label("Document Writer was created by TechyyMC", 2, 95);
        scriptLayout.addComponent(creditLabel);

        scriptArea = new TextArea(4, 20, 180, 70);
        scriptLayout.addComponent(scriptArea);

        scriptTitle = new TextField(4, 3, 180);
        this.scriptTitle.setPlaceholder("Title of Document");
        this.scriptTitle.setIcon(Icons.EDIT);
        scriptLayout.addComponent(scriptTitle);
    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
