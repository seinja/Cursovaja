public class Intervals {
    public static String[] intevals = {"","m2","M2","m3","M3","P4","P5","m6","M6","m7","M7","P8"};
    public static String[] notes = {"C","D","E","F","G","A","B"};
    public static String[] semitons = {" ","C","C#","Db","D","D#","Eb","E","F","F#","Gb","G","G#","Ab","A" ,"A#","Bb","B","B#"};


    static int semiton;
    static int degrees;


    public static String intervalConstruction(String[] args) {
        String inInteval = args[0];
        String inNote = args[1];
        String upOrLow = null;
        String note = null;
        String endNote = null;
        int endNoteId = 0;
        int startNoteId = 0;
        int semitonesCount = 0;
        int raz = 0;

        //Хз зачем эта строчка.Сам не знаю зачем написал.
        if(inNote.length() > 1){
            note = String.valueOf(inNote.charAt(0));

        }else {note = inNote;}

        //Выброс ошибки при превышении кол-ва параметров
        if(args.length > 3){
            throw new RuntimeException("Недопустимое количество элементов во входном массиве");
        }

        //Проверка на наличие 3 параметра
        if(args.length == 3){
            upOrLow = args[2];
        }else if(args.length == 2){
            upOrLow = "asc";
        }

        // Находит интервал из масива и получает его параметры
        for(int i = 0; i < intevals.length; i++){

            if(inInteval == intevals[i]){
                degrees = Integer.parseInt(String.valueOf(intevals[i].charAt(1)));
                if(i > 5){semiton = i+1;
                }else{semiton = i;}

            }
        }


        //Находит позицию в масиве нот первой ноты
        for(int i = 0; i < notes.length; i++){
            if(note.equals(notes[i])){
                startNoteId = i;
            }
        }

        int iterator = startNoteId;

        //Находим итоговую ноту по отношеню к начальной
        if(upOrLow == "asc" ) {
            while (degrees != 0) {
                if (iterator > notes.length - 1) {
                    iterator = 0;
                }
                endNote = notes[iterator];
                iterator++;
                degrees--;
            }
        }else if(upOrLow == "dsc"){
            while (degrees != 0) {
                if (iterator > notes.length - 1) {
                    iterator = 0;
                }
                endNote = notes[iterator];
                iterator--;
                degrees--;
            }
        }

        //Изменяем количество полутонов если на вход пришёл полутон
        if(inNote.contains("b")){
            semitonesCount++;
        }else if (inNote.contains("bb")){
            semitonesCount +=2;
        }else if (inNote.contains("#") || inNote.contains("##")){
            semitonesCount--;
        }

        //Получаем индексы элементов из масива полутонов для вычисления количества полутонов между нотами
        for(int i =0; i < semitons.length; i++){
            if(endNote.equals(semitons[i])){
                endNoteId = i;
            }
        }
        for(int i =0; i < semitons.length; i++){
            if(note.equals(semitons[i])){
                startNoteId = i;
            }
        }

        //Считаем полутона
        if(upOrLow == "asc"){
            iterator = startNoteId;
            while (iterator != endNoteId){
                if(iterator > semitons.length-1){
                    iterator = 0;
                }
                if(semitons[iterator].contains("b") || semitons[iterator].contains("#")){
                    semitonesCount++;
                }
                iterator++;
            }
        }else if(upOrLow == "dsc"){
            iterator = startNoteId;
            while (iterator != endNoteId){
                if(iterator > semitons.length-1){
                    iterator = 0;
                }
                if(semitons[iterator].contains("b") || semitons[iterator].contains("#")){
                    semitonesCount++;
                }
                iterator--;
            }
        }


        //Получаем итоговою ноту
        raz = semitonesCount - semiton;
        switch (raz){
            case 1:
                endNote +="b";
                break;
            case 2:
                endNote +="bb";
                break;
            case -1:
                endNote +="#";
                break;
            case -2:
                endNote +="##";
                break;
        }

        return endNote;
    }

    public static String intervalIdentification(String[] args) {
        String inteval = null;
        return inteval;
    }



}
