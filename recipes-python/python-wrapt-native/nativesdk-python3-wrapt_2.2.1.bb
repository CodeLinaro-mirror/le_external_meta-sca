SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "4be92dfbb558e2dedde6e10e1f89e2cd"
SRC_URI[sha256sum] = "6744f504375775d7609c82c8d3d94af1c9a6f05586984536905908ba905277b9"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"