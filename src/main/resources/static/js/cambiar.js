function activar(e, cod, cont) {
	e.preventDefault();
	console.log(cont);
	Swal.fire({
	  title: 'Esta seguro de activar el estado de este registro?',
	  text: 'Esta accion no se puede reversar!',
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  confirmButtonText: 'Si, Activalo!',
	  cancelButtonText: 'No, Cancelar!',
	}).then((result) => {
	  if (result.isConfirmed) {
		ruta = cont + '?accion=activar&id=' + cod;
		console.log(ruta);
		window.setTimeout(function () {
		  window.location.href = ruta;
		}, 2000);
		Swal.fire({
		  position: 'top-end',
		  icon: 'success',
		  title: 'El registro ha sido Activado',
		  showConfirmButton: false,
		  timer: 1500,
		});
	  } else {
		Swal.fire('Cancelado', 
		'Cancelaste la activacion', 
		'error');
	  }
	});
  }