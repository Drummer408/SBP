package main;

import java.io.IOException;

public interface ExternalFileFacade {
    Board loadBoardFromFile(String fileName) throws IOException, ArrayIndexOutOfBoundsException;
}
