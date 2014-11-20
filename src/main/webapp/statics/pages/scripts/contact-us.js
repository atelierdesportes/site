var ContactUs = function () {

    return {
        //main function to initiate the module
        init: function () {
			var map;
			$(document).ready(function(){
			  map = new GMaps({
				div: '#map',
	            lat: 48.150214,
				lng: -0.852102,
			  });
			   var marker = map.addMarker({
		            lat: 48.150214,
					lng: -0.852102,
		            title: 'Loop, Inc.',
		            infoWindow: {
		                content: "<b>Atelier des Portes</b><br>Lieu dit Les Portes<br>53410 Saint Ouën des Toits"
		            }
		        });

			   marker.infoWindow.open(map, marker);
			});
        }
    };

}();