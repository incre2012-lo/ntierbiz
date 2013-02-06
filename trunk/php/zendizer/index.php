<?php
/**
 * Zend Framework
 *
 * LICENSE
 *
 * This source file is subject to the new BSD license that is bundled
 * with this package in the file LICENSE.txt.
 * It is also available through the world-wide-web at this URL:
 * http://framework.zend.com/license/new-bsd
 * If you did not receive a copy of the license and are unable to
 * obtain it through the world-wide-web, please send an email
 * to license@zend.com so we can send you a copy immediately.
 *
 * @category   Zend
 * @package    Zend_Wildfire
 * @copyright  Copyright (c) 2005-2011 Zend Technologies USA Inc. (http://www.zend.com)
 * @license    http://framework.zend.com/license/new-bsd     New BSD License
 */

/* NOTE: You must have Zend Framework in your include path! */

/*
 * Run the front controller
 */
$wwwrootDir = dirname(dirname(__FILE__));
define('PATH_TO_ZF', $wwwrootDir.'/ZendFramework/library/');
define('PATH_TO_APPLICATION', dirname(__FILE__).'/application/');
define('PATH_TO_LIBRARY',dirname(__FILE__).'/library/');
define('PATH_TO_MODULES', PATH_TO_APPLICATION . 'modules/');

set_include_path(PATH_TO_ZF . PATH_SEPARATOR . PATH_TO_APPLICATION . PATH_SEPARATOR . PATH_TO_LIBRARY);

require_once 'Zend/Loader/Autoloader.php';
$autoloader = Zend_Loader_Autoloader::getInstance();
$autoloader->setFallbackAutoloader(true);

$controller = Zend_Controller_Front::getInstance();
$controller->setDefaultModule('default');
$controller->addModuleDirectory(PATH_TO_MODULES)->dispatch();
