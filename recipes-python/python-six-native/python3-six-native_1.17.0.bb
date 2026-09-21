# Ported from meta-openembedded
SUMMARY = "Python 2 and 3 compatibility library"
HOMEPAGE = "https://pypi.org/project/six/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e50fab7e9501f3dfc920eafeb24b46ea"

inherit pypi
inherit setuptools3
inherit_defer native

SRC_URI[sha256sum] = "ff70335d468e7eb6ec65b95b99d3a2836546063f63acc5171de367e834932a81"
