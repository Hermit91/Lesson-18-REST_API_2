public class WishlistResponse {
    public String clearWishlist = "<html >\n" +
            "<head>\n" +
            "    <title>Demo Web Shop. Wishlist</title>\n" +
            "    <meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\" />\n" +
            "    <meta name=\"description\" content=\"\" />\n" +
            "    <meta name=\"keywords\" content=\"\" />\n" +
            "    <meta name=\"generator\" content=\"nopCommerce\" />\n" +
            "    \n" +
            "    \n" +
            "            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
            "\n" +
            "    \n" +
            "    <link href=\"/Themes/DefaultClean/Content/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "<link href=\"/Themes/DefaultClean/Content/responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "<link href=\"/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "\n" +
            "    <script src=\"/Scripts/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/Scripts/jquery.validate.min.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/Scripts/jquery.validate.unobtrusive.min.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/Scripts/jquery-ui-1.10.3.custom.min.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/Scripts/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/Scripts/public.common.js\" type=\"text/javascript\"></script>\n" +
            "<script src=\"/Scripts/public.ajaxcart.js\" type=\"text/javascript\"></script>\n" +
            "\n" +
            "    \n" +
            "    \n" +
            "    \n" +
            "    \n" +
            "    \n" +
            "<link rel=\"shortcut icon\" href=\"http://demowebshop.tricentis.com/favicon.ico\" />\n" +
            "    <!--Powered by nopCommerce - http://www.nopCommerce.com-->\n" +
            "    <!--Copyright (c) 2008-2014-->\n" +
            "</head>\n" +
            "<body>\n" +
            "    \n" +
            "\n" +
            "\n" +
            "<div id=\"dialog-notifications-success\" title=\"Notification\" style=\"display:none;\">\n" +
            "</div>\n" +
            "<div id=\"dialog-notifications-error\" title=\"Error\" style=\"display:none;\">\n" +
            "</div>\n" +
            "<div id=\"bar-notification\" class=\"bar-notification\">\n" +
            "    <span class=\"close\" title=\"Close\">&nbsp;</span>\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "<div class=\"master-wrapper-page\">\n" +
            "    \n" +
            "    <div class=\"master-wrapper-content\">\n" +
            "        <script type=\"text/javascript\">\n" +
            "            AjaxCart.init(false, '.header-links .cart-qty', '.header-links .wishlist-qty', '#flyout-cart');\n" +
            "        </script>\n" +
            "        \n" +
            "\n" +
            "<div class=\"header\">\n" +
            "    \n" +
            "    <div class=\"header-logo\">\n" +
            "        <a href=\"/\">\n" +
            "            <img title=\"\" alt=\"Tricentis Demo Web Shop\" src=\"/Themes/DefaultClean/Content/images/logo.png\">\n" +
            "        </a>\n" +
            "    </div>\n" +
            "    <div class=\"header-links-wrapper\">\n" +
            "        <div class=\"header-links\">\n" +
            "    <ul>\n" +
            "        \n" +
            "            <li><a href=\"/customer/info\" class=\"account\">test_demowebshop_91@gmail.ru</a></li>\n" +
            "            <li><a href=\"/logout\" class=\"ico-logout\">Log out</a></li>\n" +
            "                            <li id=\"topcartlink\">\n" +
            "                <a href=\"/cart\" class=\"ico-cart\">\n" +
            "                    <span class=\"cart-label\">Shopping cart</span>\n" +
            "                    <span class=\"cart-qty\">(0)</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "                    <li>\n" +
            "                <a href=\"/wishlist\" class=\"ico-wishlist\">\n" +
            "                    <span class=\"cart-label\">Wishlist</span>\n" +
            "                    <span class=\"wishlist-qty\">(0)</span>\n" +
            "                </a>\n" +
            "            </li>\n" +
            "        \n" +
            "    </ul>\n" +
            "        <script type=\"text/javascript\">\n" +
            "            $(document).ready(function () {\n" +
            "                $('.header').on('mouseenter', '#topcartlink', function () {\n" +
            "                    $('#flyout-cart').addClass('active');\n" +
            "                });\n" +
            "                $('.header').on('mouseleave', '#topcartlink', function () {\n" +
            "                    $('#flyout-cart').removeClass('active');\n" +
            "                });\n" +
            "                $('.header').on('mouseenter', '#flyout-cart', function () {\n" +
            "                    $('#flyout-cart').addClass('active');\n" +
            "                });\n" +
            "                $('.header').on('mouseleave', '#flyout-cart', function () {\n" +
            "                    $('#flyout-cart').removeClass('active');\n" +
            "                });\n" +
            "            });\n" +
            "        </script>\n" +
            "</div>\n" +
            "\n" +
            "        <div id=\"flyout-cart\" class=\"flyout-cart\">\n" +
            "    <div class=\"mini-shopping-cart\">\n" +
            "        <div class=\"count\">\n" +
            "You have no items in your shopping cart.        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "\n" +
            "    </div>\n" +
            "    <div class=\"search-box\">\n" +
            "        \n" +
            "<form action=\"/search\" method=\"get\" onsubmit=\"return check_small_search_form()\">    <input type=\"text\" class=\"search-box-text\" id=\"small-searchterms\" autocomplete=\"off\" value=\"Search store\" name=\"q\" />\n" +
            "    <input type=\"submit\" class=\"button-1 search-box-button\" value=\"Search\" />\n" +
            "    <script type=\"text/javascript\">\n" +
            "        $(document).ready(function() {\n" +
            "            $(\"#small-searchterms\").focus(function() {\n" +
            "                if (this.value == 'Search store') {\n" +
            "                    this.value = '';\n" +
            "                }\n" +
            "            });\n" +
            "\n" +
            "            $(\"#small-searchterms\").blur(function() {\n" +
            "                if (this.value == '') {\n" +
            "                    this.value = 'Search store';\n" +
            "                }\n" +
            "            });\n" +
            "        });\n" +
            "\n" +
            "        function check_small_search_form() {\n" +
            "            var search_terms = $(\"#small-searchterms\");\n" +
            "            if (search_terms.val() == \"\" || search_terms.val() == \"Search store\") {\n" +
            "                alert('Please enter some search keyword');\n" +
            "                search_terms.focus();\n" +
            "                return false;\n" +
            "            }\n" +
            "            return true;\n" +
            "        }\n" +
            "    </script>\n" +
            "        \n" +
            "            <script type=\"text/javascript\">\n" +
            "                $(function() {\n" +
            "                    $('#small-searchterms').autocomplete({\n" +
            "                            delay: 500,\n" +
            "                            minLength: 3,\n" +
            "                            source: '/catalog/searchtermautocomplete',\n" +
            "                            select: function(event, ui) {\n" +
            "                                $(\"#small-searchterms\").val(ui.item.label);\n" +
            "                                setLocation(ui.item.producturl);\n" +
            "                                return false;\n" +
            "                            }\n" +
            "                        })\n" +
            "                        .data(\"ui-autocomplete\")._renderItem = function(ul, item) {\n" +
            "                            var t = item.label;\n" +
            "                            //html encode\n" +
            "                            t = htmlEncode(t);\n" +
            "                            return $(\"<li></li>\")\n" +
            "                                .data(\"item.autocomplete\", item)\n" +
            "                                .append(\"<a>\" + t + \"</a>\")\n" +
            "                            .appendTo(ul);\n" +
            "                    };\n" +
            "                });\n" +
            "            </script>\n" +
            "        \n" +
            "</form>\n" +
            "    </div>\n" +
            "    <div class=\"header-selectors-wrapper\">\n" +
            "        <div class=\"tax-display-type-selector\">\n" +
            "            \n" +
            "        </div>\n" +
            "        <div class=\"currency-selector\">\n" +
            "            \n" +
            "        </div>\n" +
            "        <div class=\"language-selector\">\n" +
            "            \n" +
            "        </div>\n" +
            "        \n" +
            "    </div>\n" +
            "</div>\n" +
            "\n" +
            "        <div class=\"header-menu\">\n" +
            "            \n" +
            "\n" +
            "<ul class=\"top-menu\">\n" +
            "    \n" +
            "    <li>\n" +
            "        <a href=\"/books\">Books\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/computers\">Computers\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "                <ul class=\"sublist firstLevel\">\n" +
            "    <li>\n" +
            "        <a href=\"/desktops\">Desktops\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/notebooks\">Notebooks\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/accessories\">Accessories\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "                </ul>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/electronics\">Electronics\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "                <ul class=\"sublist firstLevel\">\n" +
            "    <li>\n" +
            "        <a href=\"/camera-photo\">Camera, photo\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/cell-phones\">Cell phones\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "                </ul>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/apparel-shoes\">Apparel &amp; Shoes\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/digital-downloads\">Digital downloads\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/jewelry\">Jewelry\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/gift-cards\">Gift Cards\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    \n" +
            "</ul>\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "    $('li', '.top-menu').on('mouseenter', function () {\n" +
            "        $('a', $(this)).first().addClass('hover');\n" +
            "        if (!$(this).parent().hasClass('top-menu')) {\n" +
            "            var width = $(this).innerWidth();\n" +
            "            $('.sublist', $(this)).first().css('left', width + 15);\n" +
            "        }\n" +
            "        $('.sublist', $(this)).first().addClass('active');\n" +
            "        $('.top-menu-triangle', $(this)).addClass('active');\n" +
            "    });\n" +
            "\n" +
            "    $('li', '.top-menu').on('mouseleave', function () {\n" +
            "        $('a', $(this)).first().removeClass('hover');\n" +
            "        $('.sublist', $(this)).first().removeClass('active');\n" +
            "        $('.top-menu-triangle', $(this)).removeClass('active');\n" +
            "    });\n" +
            "\n" +
            "</script>\n" +
            "\n" +
            "    <div id=\"mob-menu-button\">\n" +
            "        <a href=\"\">\n" +
            "            <span class=\"icon\"><span class=\"line\"></span><span class=\"line\"></span><span class=\"line\"></span></span>\n" +
            "\n" +
            "            <span>Categories</span>\n" +
            "        </a>\n" +
            "    </div>\n" +
            "    <ul class=\"mob-top-menu\">\n" +
            "        \n" +
            "    <li>\n" +
            "        <a href=\"/books\">Books\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/computers\">Computers\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "                    <span class=\"expand\">&nbsp;</span>\n" +
            "                <ul class=\"sublist firstLevel\">\n" +
            "    <li>\n" +
            "        <a href=\"/desktops\">Desktops\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/notebooks\">Notebooks\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/accessories\">Accessories\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "                </ul>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/electronics\">Electronics\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "                    <span class=\"expand\">&nbsp;</span>\n" +
            "                <ul class=\"sublist firstLevel\">\n" +
            "    <li>\n" +
            "        <a href=\"/camera-photo\">Camera, photo\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/cell-phones\">Cell phones\n" +
            "        </a>\n" +
            "\n" +
            "    </li>\n" +
            "                </ul>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/apparel-shoes\">Apparel &amp; Shoes\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/digital-downloads\">Digital downloads\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/jewelry\">Jewelry\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "    <li>\n" +
            "        <a href=\"/gift-cards\">Gift Cards\n" +
            "        </a>\n" +
            "                <div class=\"top-menu-triangle\"></div>\n" +
            "\n" +
            "    </li>\n" +
            "        \n" +
            "    </ul>\n" +
            "    <script type=\"text/javascript\">\n" +
            "        $('a', $('#mob-menu-button')).toggle(function() {\n" +
            "                $('.mob-top-menu').addClass('show');\n" +
            "            },\n" +
            "            function() {\n" +
            "                $('.mob-top-menu').removeClass('show');\n" +
            "            }\n" +
            "        );\n" +
            "\n" +
            "        $(function($) {\n" +
            "            $('.mob-top-menu .expand').click(function() {\n" +
            "                var parent = $(this).parent();\n" +
            "                if (parent.hasClass('active')) {\n" +
            "                    $(\".sublist:first\", parent).hide(300);\n" +
            "                    parent.removeClass('active');\n" +
            "                } else {\n" +
            "                    $(\".sublist:first\", parent).show(300);\n" +
            "                    parent.addClass('active');\n" +
            "                }\n" +
            "            });\n" +
            "        });\n" +
            "    </script>\n" +
            "\n" +
            "        </div>\n" +
            "        \n" +
            "        \n" +
            "        <div class=\"ajax-loading-block-window\" style=\"display: none\">\n" +
            "            <div class=\"loading-image\">\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"master-wrapper-main\">\n" +
            "            \n" +
            "<div class=\"center-1\">\n" +
            "    \n" +
            "    \n" +
            "<div class=\"page wishlist-page\">\n" +
            "    <div class=\"page-title\">\n" +
            "        <h1>\n" +
            "Wishlist        </h1>\n" +
            "    </div>\n" +
            "    <div class=\"page-body\">\n" +
            "        <div class=\"wishlist-content\">\n" +
            "The wishlist is empty!        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "\n" +
            "    \n" +
            "</div>\n" +
            "\n" +
            "        </div>\n" +
            "        \n" +
            "    </div>\n" +
            "    \n" +
            "<div class=\"footer\">\n" +
            "    <div class=\"footer-menu-wrapper\">\n" +
            "        <div class=\"column information\">\n" +
            "            <h3>Information</h3>\n" +
            "            <ul>\n" +
            "                    <li><a href=\"/sitemap\">Sitemap</a></li>\n" +
            "                <li><a href=\"/shipping-returns\">Shipping & Returns</a></li>\n" +
            "                <li><a href=\"/privacy-policy\">Privacy Notice</a></li>\n" +
            "                <li><a href=\"/conditions-of-use\">Conditions of Use</a></li>\n" +
            "                <li><a href=\"/about-us\">About us</a></li>\n" +
            "                <li><a href=\"/contactus\">Contact us</a></li>\n" +
            "            </ul>\n" +
            "        </div>\n" +
            "        <div class=\"column customer-service\">\n" +
            "            <h3>Customer service</h3>\n" +
            "            <ul>\n" +
            "                <li><a href=\"/search\">Search</a> </li>\n" +
            "                    <li><a href=\"/news\">News</a></li>\n" +
            "                                    <li><a href=\"/blog\">Blog</a></li>\n" +
            "                                                    <li><a href=\"/recentlyviewedproducts\">Recently viewed products</a></li>\n" +
            "                                    <li><a href=\"/compareproducts\">Compare products list</a></li>\n" +
            "                                    <li><a href=\"/newproducts\">New products</a></li>\n" +
            "            </ul>\n" +
            "        </div>\n" +
            "        <div class=\"column my-account\">\n" +
            "            <h3>My account</h3>\n" +
            "            <ul>\n" +
            "                <li><a href=\"/customer/info\" class=\"account\">My account</a></li>\n" +
            "                    <li><a href=\"/customer/orders\">Orders</a></li>\n" +
            "                                    <li><a href=\"/customer/addresses\" class=\"\">Addresses</a></li>\n" +
            "                                    <li><a href=\"/cart\" class=\"ico-cart\">Shopping cart</a></li>\n" +
            "                                    <li><a href=\"/wishlist\" class=\"ico-wishlist\">Wishlist</a></li>\n" +
            "            </ul>\n" +
            "        </div>\n" +
            "        <div class=\"column follow-us\">\n" +
            "            <h3>Follow us</h3>\n" +
            "            <ul>\n" +
            "                    <li class=\"facebook\"><a href=\"http://www.facebook.com/nopCommerce\" target=\"_blank\">Facebook</a></li>\n" +
            "                                                    <li class=\"twitter\"><a href=\"https://twitter.com/nopCommerce\" target=\"_blank\">Twitter</a></li>\n" +
            "                                                    <li class=\"rss\"><a href=\"/news/rss/1\">RSS</a></li>\n" +
            "                                                    <li class=\"youtube\"><a href=\"http://www.youtube.com/user/nopCommerce\" target=\"_blank\">YouTube</a></li>\n" +
            "                                                    <li class=\"google-plus\"><a href=\"https://plus.google.com/+nopcommerce\" target=\"_blank\">Google+</a></li>\n" +
            "            </ul>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <div class=\"footer-poweredby\">\n" +
            "        Powered by <a href=\"http://www.nopcommerce.com/\">nopCommerce</a>\n" +
            "        \n" +
            "    </div>\n" +
            "    <div class=\"footer-disclaimer\">\n" +
            "        Copyright &copy; 2022 Tricentis Demo Web Shop. All rights reserved.\n" +
            "    </div>\n" +
            "    <div class=\"footer-store-theme\">\n" +
            "        \n" +
            "\n" +
            "\n" +
            "    </div>\n" +
            "    \n" +
            "</div>\n" +
            "</div>\n" +
            "\n" +
            "<!-- Google code for Analytics tracking -->\n" +
            "<script type=\"text/javascript\">\n" +
            "var _gaq = _gaq || [];\n" +
            "_gaq.push(['_setAccount', 'UA-6574346-11']);\n" +
            "_gaq.push(['_trackPageview']);\n" +
            "\n" +
            "(function() {\n" +
            "    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n" +
            "    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n" +
            "    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n" +
            "})();\n" +
            "</script>\n" +
            "\n" +
            "\n" +
            "    \n" +
            "    \n" +
            "</body>\n" +
            "</html>";
}
