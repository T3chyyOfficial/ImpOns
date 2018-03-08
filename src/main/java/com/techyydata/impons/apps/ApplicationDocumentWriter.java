package com.techyydata.impons.apps;

/**
 * Document Writer Application Class
 * Author: TechyyMC
 */

import net.minecraft.nbt.NBTTagCompound;

import com.mrcrayfish.device.api.app.*;
import com.mrcrayfish.device.api.app.component.*;

public class ApplicationDocumentWriter extends Application {

    //Application Variables
    private Layout scriptLayout;
    private Label creditLabel;
    private TextArea scriptArea;
    private TextField scriptTitle;
    private Button saveButton;
    private Button openButton;

    //Application Components
    @Override
    public void init() {
        scriptLayout = new Layout(0, 0, 225, 130);
        this.setCurrentLayout(scriptLayout);

        creditLabel = new Label("Document Writer was created by TechyyMC", 2, 95);
        scriptLayout.addComponent(creditLabel);

        scriptArea = new TextArea(4, 20, 200, 70);
        scriptLayout.addComponent(scriptArea);

        scriptTitle = new TextField(4, 3, 200);
        this.scriptTitle.setPlaceholder("Title of Document");
        this.scriptTitle.setIcon(Icons.EDIT);
        scriptLayout.addComponent(scriptTitle);

        saveButton = new Button(1, 106, "Save");
        saveButton.setSize(63, 20);
        saveButton.setClickListener((mouseX, mouseY, mouseButton) -> {
            if (mouseButton == 0) {
                this.openDialog(new Dialog.SaveFile(this, new NBTTagCompound()));
            }
        });
        scriptLayout.addComponent(saveButton);

        openButton = new Button(70, 106, "Open");
        openButton.setSize(63, 20);
        openButton.setClickListener((mouseX, mouseY, mouseButton) -> {
            if (mouseButton == 0) {
                this.openDialog(new Dialog.OpenFile(this));
            }
        });
        scriptLayout.addComponent(openButton);

    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
