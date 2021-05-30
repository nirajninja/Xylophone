package com.example.xylophone

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private val  sim_sound = 7
    private val lft_vol = 1.0f
    private val rgt_vol = 1.0f
    private val loop = 0
    private val prty = 0
    private val NORMAL_PLAY_RATE = 1.0f

    lateinit var  mSoundPool:SoundPool
    var  mCSoundId1:Int=0
    var  mDSoundId2:Int = 0
    var mESoundId3:Int=0
    var mFSoundId4:Int=0
    var mGSoundId5:Int=0
    var mASoundId6:Int=0
    var mBSoundId7:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Helpful Constants
        // Add member variables here




            // Create a new SoundPool
            mSoundPool =  SoundPool(sim_sound, AudioManager.STREAM_MUSIC, 0);

            // Load and get the IDs to identify the sounds
            mCSoundId1 = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
            mDSoundId2 = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
            mESoundId3 = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
            mFSoundId4 = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
            mGSoundId5 = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
            mASoundId6 = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
            mBSoundId7 = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

        }

    fun c(view: View) {
        mSoundPool.play(mCSoundId1, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)

    }

    fun d(view: View) {
        mSoundPool.play(mDSoundId2, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)

    }
    fun e(view: View) {
        mSoundPool.play(mESoundId3, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)

    }
    fun f(view: View) {
        mSoundPool.play(mFSoundId4, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)

    }
    fun g(view: View) {
        mSoundPool.play(mGSoundId5, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)
    }
    fun a(view: View) {
        mSoundPool.play(mASoundId6, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)
    }
    fun b(view: View) {
        mSoundPool.play(mBSoundId7, lft_vol, rgt_vol, prty,loop,NORMAL_PLAY_RATE)
    }

}



