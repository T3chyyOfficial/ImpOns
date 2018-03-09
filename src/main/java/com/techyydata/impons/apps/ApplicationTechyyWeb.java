package com.techyydata.impons.apps;

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.component.Button;
import com.mrcrayfish.device.api.app.component.TextArea;
import com.mrcrayfish.device.api.app.component.TextField;
import net.minecraft.nbt.NBTTagCompound;

import java.awt.*;

public class ApplicationTechyyWeb extends Application {


    //Application Component Variables
    private static final String WEBSITE1 = "www.techyy.com";

    private Layout layout;
    private TextArea websiteArea;
    private TextField url;
    private Button go;
    private Layout layout2;

    @Override
    public void init() {
        layout = new Layout(0, 0, 225, 130);
        this.setCurrentLayout(layout);

        websiteArea = new TextArea(1, 20, 200, 70);
        websiteArea.setEnabled(false);
        layout.addComponent(websiteArea);

        url = new TextField(2, 3, 200);
        layout.addComponent(url);

        go = new Button(150, 5, "Go");
        go.setSize(16, 16);
        go.setClickListener((mouseX, mouseY, mouseButton) -> {
            if (mouseButton == 0) {
                if(url.getText().equals(WEBSITE1));
                {
                    this.setCurrentLayout(layout2);
                }

            }
        });
        layout.addComponent(go);

        layout2 = new Layout(0, 0, 255, 130);

        websiteArea = new TextArea(1, 20, 224, 70);
        websiteArea.writeText("Welcome to my website!");
        websiteArea.setTextColor(Color.blue);
        websiteArea.setEnabled(false);
        layout2.addComponent(websiteArea);

        url = new TextField(2, 3, 200);
        layout2.addComponent(url);

        go = new Button(150, 5, "Go");
        go.setSize(16, 16);
        layout2.addComponent(go);


    }

    @Override
    public void load(NBTTagCompound nbtTagCompound) {

    }

    @Override
    public void save(NBTTagCompound nbtTagCompound) {

    }
}
