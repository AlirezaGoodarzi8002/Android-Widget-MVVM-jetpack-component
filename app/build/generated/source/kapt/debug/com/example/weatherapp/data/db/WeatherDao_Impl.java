package com.example.weatherapp.data.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weatherapp.data.model.Clouds;
import com.example.weatherapp.data.model.Converters;
import com.example.weatherapp.data.model.Main;
import com.example.weatherapp.data.model.Weather;
import com.example.weatherapp.data.model.WeatherModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherModel> __insertionAdapterOfWeatherModel;

  private final Converters __converters = new Converters();

  public WeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherModel = new EntityInsertionAdapter<WeatherModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `weather_table` (`weatherId`,`weather`,`cloudsPercentInSky`,`temp`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherModel value) {
        stmt.bindLong(1, value.getWeatherId());
        final String _tmp = __converters.fromWeatherList(value.getWeather());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final Clouds _tmpClouds = value.getClouds();
        if(_tmpClouds != null) {
          if (_tmpClouds.getCloudsPercentInSky() == null) {
            stmt.bindNull(3);
          } else {
            stmt.bindString(3, _tmpClouds.getCloudsPercentInSky());
          }
        } else {
          stmt.bindNull(3);
        }
        final Main _tmpMain = value.getMain();
        if(_tmpMain != null) {
          if (_tmpMain.getTemperature() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpMain.getTemperature());
          }
        } else {
          stmt.bindNull(4);
        }
      }
    };
  }

  @Override
  public Object insert(final WeatherModel[] weatherModel,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWeatherModel.insert(weatherModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getWeather(final Continuation<? super WeatherModel> continuation) {
    final String _sql = "SELECT * FROM weather_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<WeatherModel>() {
      @Override
      public WeatherModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWeatherId = CursorUtil.getColumnIndexOrThrow(_cursor, "weatherId");
          final int _cursorIndexOfWeather = CursorUtil.getColumnIndexOrThrow(_cursor, "weather");
          final int _cursorIndexOfCloudsPercentInSky = CursorUtil.getColumnIndexOrThrow(_cursor, "cloudsPercentInSky");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final WeatherModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpWeatherId;
            _tmpWeatherId = _cursor.getInt(_cursorIndexOfWeatherId);
            final List<Weather> _tmpWeather;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfWeather)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfWeather);
            }
            _tmpWeather = __converters.toWeatherList(_tmp);
            final Clouds _tmpClouds;
            if (! (_cursor.isNull(_cursorIndexOfCloudsPercentInSky))) {
              final String _tmpCloudsPercentInSky;
              if (_cursor.isNull(_cursorIndexOfCloudsPercentInSky)) {
                _tmpCloudsPercentInSky = null;
              } else {
                _tmpCloudsPercentInSky = _cursor.getString(_cursorIndexOfCloudsPercentInSky);
              }
              _tmpClouds = new Clouds(_tmpCloudsPercentInSky);
            }  else  {
              _tmpClouds = null;
            }
            final Main _tmpMain;
            if (! (_cursor.isNull(_cursorIndexOfTemperature))) {
              final String _tmpTemperature;
              if (_cursor.isNull(_cursorIndexOfTemperature)) {
                _tmpTemperature = null;
              } else {
                _tmpTemperature = _cursor.getString(_cursorIndexOfTemperature);
              }
              _tmpMain = new Main(_tmpTemperature);
            }  else  {
              _tmpMain = null;
            }
            _result = new WeatherModel(_tmpWeatherId,_tmpClouds,_tmpMain,_tmpWeather);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
