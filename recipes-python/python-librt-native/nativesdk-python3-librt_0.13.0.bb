SUMMARY = "Mypyc runtime library"
HOMEPAGE = "https://github.com/mypyc/librt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42baf4796d8073a1896b15d602af78f6"

SRC_URI[sha256sum] = "1d2a610c14ac0d0750ee0a3ab8548e83155258387891caaca04def4bf7289781"

inherit pypi python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE = "librt"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
"
