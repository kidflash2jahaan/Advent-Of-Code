package com.systemerr.adventofcode;

import java.util.ArrayList;

public class Y2015D3House {
    public final int x;
    public final int y;

    public int presents = 1;

    public Y2015D3House(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void visitHouse(int x, int y, ArrayList<Y2015D3House> houses) {
        boolean foundHouse = false;
        for (Y2015D3House currentHouse : houses) {
            if (currentHouse.x == x && currentHouse.y == y) {
                foundHouse = true;
                currentHouse.presents++;
                break;
            }
        }
        if (!foundHouse) {
            houses.add(new Y2015D3House(x, y));
        }
    }
}
