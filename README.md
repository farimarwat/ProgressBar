# ProgressBar
The most simple animated progressbar for android

<img src="https://github.com/farimarwat/ProgressBar/blob/master/demo.gif" width="30%" height="30%"/>

### Implementation
```
    implementation 'io.github.farimarwat:simpleprogressbar:1.1'

```

### XML Usage
```
<com.farimarwat.simpleprogress.ProgressBar
        android:id="@+id/progress"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_marginStart="32dp"
        android:layout_marginEnd="32dp"
        app:sp_progress="50"
        app:sp_stroke="30" // strokewidth of the progressbar
        app:sp_backgroundcolor="@color/colorbackground"
        app:sp_progresscolor="@color/colorprogress"
        />
```

### Kotlin Usage
```
val progress = findViewById<ProgressBar>(R.id.progress)
progress.setProgress(50) //range 0-100
```
