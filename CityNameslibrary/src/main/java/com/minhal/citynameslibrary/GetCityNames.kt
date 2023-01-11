package com.minhal.citynameslibrary

import java.util.*

class GetCityNames {

    fun getLocalizedCityName(cityName: String, localAddressName: String) : String {
        val cityNameLC = cityName.lowercase(Locale.getDefault())
        if(cityName == "دبي"){
            return "Dubai"
        }
        if (cityNameLC.contains("Al Ruways", true)) {
            return "Ruwais"
        }
        // UAE
        // Check if it is not Ras Al Khaimah
        if (cityNameLC == "ras al khaimah" || cityNameLC == "ras al khaima" || cityNameLC == "ras al-khaimah"
            || cityNameLC == "ras al-khaima") {
            return "Ras Al Khaima"
        }
        // Check if it is not Umm Al-Quwain
        if (cityNameLC == "umm al-quwain" || cityNameLC == "umm al-quawain" || cityNameLC == "umm al quawain") {
            return "Umm Al Quawain"
        }
        // Oman
        if (cityNameLC == "bawshar" || cityNameLC == "qurayyat" || cityNameLC == "muttrah" ||
            cityNameLC == "al amarat" || cityNameLC == "al-amarat" || cityNameLC == "al seeb" ||
            cityNameLC == "al-seeb" || cityNameLC == "mascate" || cityNameLC == "muscat" ){
            return   "Muscat"
        }
        // Georgia
        if (cityNameLC == "Tbilisi" || cityNameLC == "Tiflis") {
            return "T'bilisi"
        }
        if(cityNameLC.contains("Shuwaikh Industrial", true) || cityNameLC.contains("Al Rai", true)){
            return "Kuwait"
        }
        if(cityNameLC.contains("Sanabis", true) || cityNameLC.contains("Jidhafs", true)){
            return "Manama"
        }
        if(cityNameLC.contains("Al Kuwayt", true) ||cityNameLC.contains("Kuwait", true)){
            return  "Kuwait"
        }
        if(cityNameLC.contains("Bahrain", true) ){
            return  "Bahrain"
        }
        if(cityNameLC.contains("zinj", true) ){
            return  "Bahrain"
        }
        if(localAddressName.contains("Al Kuwayt", true) || localAddressName.contains("Kuwait", true)){
            return  "Kuwait"
        }
        if(localAddressName.contains("Bahrain", true) ){
            return  "Bahrain"
        }
        return cityName
    }
}