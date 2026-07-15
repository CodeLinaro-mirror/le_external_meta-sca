SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "9c9ae37358518d080b2881829ec199bd"
SRC_URI[sha256sum] = "0788e321027c999bf221b667bd4a54aaefd1a36283749a860ac3eb77daed0302"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"