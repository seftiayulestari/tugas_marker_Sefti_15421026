package com.example.microsoft.tgs_marker_sefti_15421026;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        GeoPoint startPoint1 = new GeoPoint(-5.390029, 105.261079);
        IMapController mapController1 = map.getController();
        mapController1.setZoom(15);
        mapController1.setCenter(startPoint1);

        Marker startMarker1 = new Marker(map);
        startMarker1.setPosition(startPoint1);
        startMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker1);
        map.invalidate();
        startMarker1.setIcon(getResources().getDrawable(R.drawable.icon1));
        startMarker1.setTitle("Museum Lampung");

        GeoPoint startPoint2 = new GeoPoint(-5.375348, 105.246246);
        IMapController mapController2 = map.getController();
        mapController2.setZoom(15);
        mapController2.setCenter(startPoint2);

        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.icon2));
        startMarker2.setTitle("Pascasarjana UBL");

        GeoPoint startPoint3 = new GeoPoint(-5.379534, 105.251704);
        IMapController mapController3 = map.getController();
        mapController3.setZoom(15);
        mapController3.setCenter(startPoint3);

        Marker startMarker3 = new Marker(map);
        startMarker3.setPosition(startPoint3);
        startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker3);
        map.invalidate();
        startMarker3.setIcon(getResources().getDrawable(R.drawable.icon3));
        startMarker3.setTitle("Universitas Bandar Lampung");

        GeoPoint startPoint4 = new GeoPoint(-5.381786, 105.259613);
        IMapController mapController4 = map.getController();
        mapController4.setZoom(15);
        mapController4.setCenter(startPoint4);

        Marker startMarker4 = new Marker(map);
        startMarker4.setPosition(startPoint4);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().getDrawable(R.drawable.icon4));
        startMarker4.setTitle("Mall Bumi Kedaton");

        GeoPoint startPoint5 = new GeoPoint(-5.420151,105.276469);
        IMapController mapController5 = map.getController();
        mapController5.setZoom(15);
        mapController5.setCenter(startPoint5);

        Marker startMarker5 = new Marker(map);
        startMarker5.setPosition(startPoint5);
        startMarker5.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker5);
        map.invalidate();
        startMarker5.setIcon(getResources().getDrawable(R.drawable.icon5));
        startMarker5.setTitle("Jl Kadu Pedang");

    }
}
