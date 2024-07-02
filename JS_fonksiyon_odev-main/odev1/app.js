let myName = document.getElementById("myName");
myName.innerHTML = prompt("Adınız nedir:");

let myClock = document.querySelector("#myClock");

function showTime() {
    // Şu anki zamanı al
    var currentDate = new Date();

    // Tarih ve saat bilgisini al
    var year = currentDate.getFullYear();
    var month = currentDate.getMonth() + 1; // Ay bilgisini 1 ekleyerek ayın doğru şekilde alınması
    var day = currentDate.getDate();
    var hours = currentDate.getHours();
    var minutes = currentDate.getMinutes();
    var seconds = currentDate.getSeconds();

    // Zaman formatını oluştur
    var timeString = year + '-' + month + '-' + day + ' ' + hours + ':' + minutes + ':' + seconds;

    return timeString;
}

// Saati her saniyede bir güncelle
function updateTime() {
    myClock.innerHTML = showTime();
}

// İlk çalıştırma
updateTime();

// Her saniye güncelle
setInterval(updateTime, 1000);
