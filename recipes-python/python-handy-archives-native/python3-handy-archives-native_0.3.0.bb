SUMMARY = "Some handy archive helpers for Python."
HOMEPAGE = "https://github.com/domdfcoding/handy-archives"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

SRC_URI[sha256sum] = "2a8d125cd9c42433b978384834f4a1df184a9e3bab68bf440df184b6dae12ff3"

inherit pypi
inherit pypi-old
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "handy-archives"
