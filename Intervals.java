import javax.sound.midi.Soundbank;
import java.awt.*;

public class Intervals {
    public static String[] intevals = {"","m2","M2","m3","M3","P4","P5","m6","M6","m7","M7","P8"};
    public static String[] notes = {"C","D","E","F","G","A","B"};
    public static String[] semitons = {"C","-","-","D","-","-","E","-","F","-","-","G","-","-","A","-","-","B","-"};


    static int semiton;
    static int degrees;


    public static String intervalConstruction(String[] args) {
        String inInteval = args[0];
        String inNote = args[1];
        String upOrLow = null;
        String endNote = null;

        int startNoteId = 0;
        int startSemitonId = 0;
        int endNoteId = 0;
        int endSemitonId = 0;
        int semitonsCount = 0;
        int semitonDif = 0;
        int it = 0;


        //Проверка на превышения массива.
        if(args.length > 3){
            throw new RuntimeException("Недопустимое количество элементов во входном массиве");
        }

        //Проверкана наличие 3 элемента входного масива.Если отсутствует,то указатель принимает значение "abs".
        if(args.length == 2){
            upOrLow = "asc";
        }else{
            upOrLow = args[2];
        }


        // Находит интервал из масива и получает его занчение.
        for(int i = 0; i < intevals.length; i++){

            if(inInteval == intevals[i]){
                degrees = Integer.parseInt(String.valueOf(intevals[i].charAt(1)));
                if(i > 5){semiton = i+1;
                }else{semiton = i;}

            }
        }


        //Находит индекс первой ноты в массиве нот.
        for(int i = 0; i < notes.length; i++){
            if(String.valueOf(inNote.charAt(0)).equals(notes[i])){
                startNoteId = i;
                break;
            }
        }

        //Находит индекс последней ноты в массиве нот.
        it = startNoteId;

        if(upOrLow.equals("asc")) {
            for (int i = 0; i != degrees; i++) {
                if (it > notes.length - 1) {
                    it = 0;
                }
                endNoteId = it;
                it++;
            }
        }else if(upOrLow.equals("dsc")){
            for (int i = 0; i != degrees; i++) {
                if (it < 0) {
                    it = notes.length-1;
                }
                endNoteId = it;
                it--;
            }
        }

        endNote = notes[endNoteId];

        //Нахождение индекса первого и последнего элемента в массиве полунот и получение их значение.
        for(int i = 0; i < semitons.length; i++){
            if(inNote.contains(semitons[i])){
                startSemitonId = i;
            }
        }
        for (int i = 0; i < semitons.length; i++){
            if(endNote.contains(semitons[i])){
                endSemitonId = i;
            }
        }

        //Подсчёт количества полунот от первго до последнего масива с учётом указателя.
        it = startSemitonId;
        if(upOrLow.equals("asc")) {
            while (it != endSemitonId) {
                if (it > semitons.length - 1) {
                    it = 0;
                }
                if (semitons[it].equals("-")) {
                    semitonsCount++;
                }
                it++;
            }
        }else if(upOrLow.equals("dsc")){
            while (it != endSemitonId) {
                if (it == 0) {
                    it = semitons.length-1;
                }
                if (semitons[it].equals("-")) {
                    semitonsCount++;
                }
                it--;
            }
        }

        //Изменение счётчика полунот если на вход пришла полунота.
        if(upOrLow.equals("asc")){
            if(inNote.contains("b")){
                semitonsCount++;
            }else if(inNote.contains("#")){
                semitonsCount--;
            }

        }else if(upOrLow.equals("dsc")){
            if(inNote.contains("b")){
                semitonsCount--;
            }else if(inNote.contains("#")){
                semitonsCount++;
            }
        }

        //Вычисление разности полутонов(Интервальные полутона - счётчик полутонов)
        semitonDif = semiton-semitonsCount;

        //На основе  разницы изменяеться последняя нота.Поднимаем или опускаем на  полутон.
        if(upOrLow.equals("asc")){
            switch (semitonDif){
                case 1:
                    endNote += "#";
                    break;
                case 2:
                    endNote += "##";
                    break;
                case -1:
                    endNote += "b";
                    break;
                case -2:
                    endNote += "bb";
                    break;
                case 0:
                    break;
            }

        }else if(upOrLow.equals("dsc")){
            switch (semitonDif){
                case 1:
                    endNote += "b";
                    break;
                case 2:
                    endNote += "bb";
                    break;
                case -1:
                    endNote += "#";
                    break;
                case -2:
                    endNote += "##";
                    break;
                case 0:
                    break;
            }
        }

        return endNote;
    }

    public static String intervalIdentification(String[] args) {
        String endInterval = null;
        return endInterval;
    }



}
