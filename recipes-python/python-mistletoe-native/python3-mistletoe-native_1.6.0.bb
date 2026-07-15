SUMMARY = "A fast, extensible Markdown parser in pure Python."
HOMEPAGE = "https://github.com/miyuchina/mistletoe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57943b291c8e54f0e5b648dc17a6f76c"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "92f066c4720a25fa24bf260e6413702bbff3a5b8a93af314cb6cd8589726a8e1"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "mistletoe"
