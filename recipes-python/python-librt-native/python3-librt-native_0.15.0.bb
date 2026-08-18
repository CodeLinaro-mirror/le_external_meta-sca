SUMMARY = "Mypyc runtime library"
HOMEPAGE = "https://github.com/mypyc/librt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42baf4796d8073a1896b15d602af78f6"

SRC_URI[sha256sum] = "4e66cbe84437497d951b799d3e1551291b6fb3d643820a7014b3655d57a59162"

inherit pypi python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "librt"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
"
