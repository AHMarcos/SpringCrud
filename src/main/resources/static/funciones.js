function eliminar(id) {
    swal({
        title: "Estas seguro causa?",
        text: "Se va eliminar pa siempre, ojo!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/eliminar/"+id,
                    success: function(res) {
                        console.log(res);
                    }
                });
                swal("Se elimino correctamente causa", {
                    icon: "success",
                }).then((ok)=>{
                    if (ok){
                        location.href="/listar";
                    }
                });
            } else {
                swal("Piensalo mejor");
            }
        });
}