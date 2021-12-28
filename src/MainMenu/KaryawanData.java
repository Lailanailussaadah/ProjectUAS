/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import javafx.scene.chart.PieChart.Data;

/*import SubMenu.Karyawan;*/

/**
 *
 * @author ASUS
 */
public interface KaryawanData {
    public void add(Data data);
    public void delete(String idk);
    public void search(String idk);
    public void print();

    public void TambahData(Karyawan karyawan);

    public void HapusData(String kode);

    public void CariData(String kode);

    public void LihatData();
}
