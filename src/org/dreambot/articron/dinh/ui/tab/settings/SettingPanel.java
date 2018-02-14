package org.dreambot.articron.dinh.ui.tab.settings;

import org.dreambot.articron.dinh.swing.HFrame;
import org.dreambot.articron.dinh.swing.HPanel;
import org.dreambot.articron.dinh.ui.tab.settings.sub.MainSettings;
import org.dreambot.articron.dinh.ui.tab.settings.sub.TeleportSettings;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by: Niklas
 * Date: 14.02.2018
 * Alias: Dinh
 * Time: 13:39
 */

public class SettingPanel extends HPanel {

    private MainSettings mainSettings;
    private TeleportSettings teleportSettings;

    public SettingPanel(Border border) {
        super(new BorderLayout(), border);
        add(mainSettings = new MainSettings(getBorder("Main")), BorderLayout.CENTER);
        add(teleportSettings = new TeleportSettings(getBorder("Teleport")), BorderLayout.EAST);
    }

    public static TitledBorder getBorder(String title) {
        TitledBorder border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(HFrame.ELEMENT_BG, 2), title);
        border.setTitleColor(HFrame.FOREGROUND);
        return border;
    }


    public MainSettings getMainSettings() {
        return mainSettings;
    }

    public TeleportSettings getTeleportSettings() {
        return teleportSettings;
    }
}
