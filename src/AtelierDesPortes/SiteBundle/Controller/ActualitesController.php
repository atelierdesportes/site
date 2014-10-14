<?php

namespace AtelierDesPortes\SiteBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Template;

class ActualitesController extends Controller
{
    public function initListAction()
    {
        return $this->render("SiteBundle:Actualites:blog.html.twig");
    }

    public function initDetailAction()
    {
        return $this->render("SiteBundle:Actualites:blog_item_detail.html.twig");
    }

}
