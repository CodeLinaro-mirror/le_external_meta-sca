SUMMARY = "automatically give your module the ability to have plugins"
HOMEPAGE = "https://metacpan.org/pod/Module::Pluggable"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://README;beginline=323;endline=326;md5=a63e0dc94502aefcfbb9b75598561357"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-${PV}.tar.gz"

SRC_URI[md5sum] = "744c7c6c9c4b8083a715862c5ca08545"
SRC_URI[sha256sum] = "970fd13accd3d538e637db080ebbd9898020c8b5591837c8493a39edd737922d"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Module-Pluggable-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
