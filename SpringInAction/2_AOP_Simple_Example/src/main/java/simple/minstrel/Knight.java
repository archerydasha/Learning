package simple.minstrel;

/**
 * Created by Dasha on 17.03.16.
 */
public class Knight {
    Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
