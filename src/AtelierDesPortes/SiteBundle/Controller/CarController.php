<?php

namespace AtelierDesPortes\SiteBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Template;

use GuzzleHttp\Client;

class CarController extends Controller
{
    public function initListAction()
    {
    	$client = new Client();
		$response = $client->get('http://localhost:3000/cars');
		$json = $response->json();
        return $this->render("SiteBundle:Cars:car_list.html.twig", array('cars' => $json ));
    }

    public function initDetailAction($car_id)
    {
    	$client = new Client();
		$response = $client->get('http://localhost:3000/cars/' . $car_id);
		$json = $response->json();
        return $this->render("SiteBundle:Cars:car_detail.html.twig", array('car' => $json ));
    }

}
