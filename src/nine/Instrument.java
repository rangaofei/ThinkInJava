package nine;

import eight.Note;

/**
 * Created by saka on 2017/2/12.
 */
interface Instrument {
    int VALUE=5;
    void play(Note n);
    void adjust();
}
