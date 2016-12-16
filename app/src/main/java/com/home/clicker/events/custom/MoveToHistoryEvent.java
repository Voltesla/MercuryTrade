package com.home.clicker.events.custom;

import com.home.clicker.events.SCEvent;

import javax.swing.*;

/**
 * Created by Константин on 16.12.2016.
 */
public class MoveToHistoryEvent implements SCEvent {
    private JPanel messagePanel;

    public MoveToHistoryEvent(JPanel messagePanel) {
        this.messagePanel = messagePanel;
    }

    public JPanel getMessagePanel() {
        return messagePanel;
    }
}