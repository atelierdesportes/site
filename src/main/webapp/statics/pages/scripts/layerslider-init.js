var LayersliderInit = function () {

    return {
        initLayerSlider: function () {
            $('#layerslider').layerSlider({
                skinsPath : 'http://localhost:8080/site-webapp/statics/global/plugins/slider-layer-slider/skins/',
                skin : 'fullwidth',
                thumbnailNavigation : 'hover',
                hoverPrevNext : false,
                responsive : true,
                responsiveUnder : 960,
                layersContainer : 960
            });
        }
    };

}();