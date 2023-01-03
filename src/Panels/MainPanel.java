package Panels;

import Balls.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {
    private ArrayList<Row> rows = new ArrayList<>();
    private int countY;
    public MainPanel() {
        super();
        this.requestFocus();
        this.setFocusable(true);
        setBackground(Color.PINK);
        countY = 4;
        addMainRows();
    }

    public void addMainRows() {
        for(int i=0; i<5; i++) {
            Row row = new Row(0,countY*35,787,35,new RowBalls("Full"));
            countY--;
            rows.add(row);
            this.add(row);
        }
    }

    public void addRow() {
        Row row = new Row(0,countY*35,787,35,new RowBalls("Random"));
        rows.add(row);
        this.add(row);
    }


    public int getCountY() {
        return countY;
    }

    public void setCountY(int countY) {
        this.countY = countY;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }
}
