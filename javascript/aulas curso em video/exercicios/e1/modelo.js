function carregar () {
    var msg = window.document.getElementById('msg')
    var img = window.document.querySelector('body')
    var data = new Date()
    //var hora = data.getHours()
    var hora = 20
    msg.innerHTML = `${hora}`
    if (hora >= 18 && hora <= 23) {
        document.body.style.backgroundImage = 'url(noite.jpg)'

}