<?php

namespace AtelierDesPortes\SiteBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Template;

class ContactController extends Controller
{
    public function initAction()
    {
        return $this->render("SiteBundle:Contact:contact.html.twig");
    }

}
