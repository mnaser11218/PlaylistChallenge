package io.zipcoder;

public class Music {

    public String[] getPlayList() {
        return playList;
    }

    public void setPlayList(String[] playList) {
        this.playList = playList;
    }

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }
    public Integer selection(Integer startIndex, String selection){

        Integer counterUp = 0;
        Integer counterDown =0;
    String []playlist = this.getPlayList();
    for(int i=startIndex; i<= playlist.length; i++){
        if(playlist[i].equals(selection)){
            //counterUp++;
            System.out.println("reached goal: your song is : " + playlist[i] + " "+ i);
            break;
        }
        if(i == playlist.length-1){
            i=-1;
        }
        counterUp++;
    }

for(int i=startIndex; i<= playlist.length; i--){

    if(playlist[i].equals(selection)){
        //counterDown++;
        break;
    }
    if(i== 0){
        i= playlist.length;
    }
    counterDown++;
}
if(counterDown < counterUp){
    return counterDown;
}else{
    return counterUp;
}
    }
}
