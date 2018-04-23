package com.example.android.miwok;


/**
 * Created by Polina on 04/04/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private int mMusicResourceId;
    private static final int NO_IMAGE= -1;

    /**
     * Constructor that takes Miwok translation, default translation, image and music
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int musicResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mMusicResourceId = musicResourceID;
    }

    /**
     * Constructor that takes Miwok translation, default translation, music
     */
    public Word(String defaultTranslation, String miwokTranslation,  int musicResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMusicResourceId = musicResourceID;
    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get music item id
     */
    public int getMusicResourceId()
    {
        return mMusicResourceId;
    }

    /**
     * Get image item id
     */
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    public boolean hasImage () {
        return mImageResourceId != NO_IMAGE;
    }
}
