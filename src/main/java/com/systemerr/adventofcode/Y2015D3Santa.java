package com.systemerr.adventofcode;

public class Y2015D3Santa {
    public int x = 0;
    public int y = 0;

    public void move(char instruction) {
        switch (instruction) {
            case '^':
                y++;
                break;
            case 'v':
                y--;
                break;
            case '>':
                x++;
                break;
            case '<':
                x--;
                break;
        }
    }
}
