package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExternalFileFacadeImpl implements ExternalFileFacade{

    @Override
    public Board loadBoardFromFile(final String fileName) throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String[] firstLine = reader.readLine().split(",");
        if (firstLine.length != 2) {
            reader.close();
            throw new IOException("Invalid number of dimension parameters.");
        }

        int width = Integer.parseInt(firstLine[0]);
        int height = Integer.parseInt(firstLine[1]);
        Board board = new SimpleBoard(width, height);

        String line = "";
        int count = 0;
        while ((line = reader.readLine()) != null) {
            String[] lineList = line.split(",");
            for (int i = 0; i < width; i++) {
                board.setCell(Integer.parseInt(lineList[i]), i, count);
            }
            count++;
        }

        reader.close();
        return board;
    }
}
